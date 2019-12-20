package org.buaa.platform.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.buaa.platform.entity.Authors;
import org.buaa.platform.entity.User;
import org.buaa.platform.mapper.AuthorsMapper;
import org.buaa.platform.service.PaperService;
import org.buaa.platform.service.UserService;
import org.buaa.platform.tool.RetResponse;
import org.buaa.platform.tool.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/paper/"})
public class PaperController {
    @Autowired
    PaperService paperService;
    @Autowired
    UserService userService;
    @Autowired
    AuthorsMapper authorsMapper;
    @GetMapping({"detail"})
    public RetResult<Object> getDetail(String paperID){
        try {
            return RetResponse.makeOKRsp( paperService.getDetail(paperID));
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
    @PostMapping(value = "claim")
    public RetResult<Object> claim(String paperID){
        try {
            Subject subject = SecurityUtils.getSubject();
            String userName = (String) subject.getPrincipal();
            User user = userService.getInfo(userName);
            if (user.getSpecialID()==null || user.getSpecialID().equals(""))
                throw new Exception("只有专家才可进行该操作");
            Authors authors = new Authors();
            authors.setPaperID(paperID);
            authors.setSpecialID(user.getSpecialID());
            authorsMapper.insertAuthors(authors);
            return RetResponse.makeOKRsp();
        }
        catch (Exception e)
        {
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
}
