package org.buaa.platform.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.buaa.platform.entity.User;
import org.buaa.platform.service.StarService;
import org.buaa.platform.service.UserService;
import org.buaa.platform.tool.RetResponse;
import org.buaa.platform.tool.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/star/"})
public class StarController {
    @Autowired
    UserService userService;
    @Autowired
    StarService starService;
    @PostMapping(value = "add")
    public RetResult<Object> add(String paperID){
        Subject subject = SecurityUtils.getSubject();
        String username = (String)subject.getPrincipal();
        try {
            User user = userService.getInfo(username);
            starService.add(user.getUserID(),paperID);
            return RetResponse.makeOKRsp();
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
    @PostMapping(value = "cancel")
    public RetResult<Object> cancel(String paperID){
        Subject subject = SecurityUtils.getSubject();
        String username = (String)subject.getPrincipal();
        try {
            User user = userService.getInfo(username);
            starService.cancel(user.getUserID(),paperID);
            return RetResponse.makeOKRsp();
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
    @PostMapping(value = "get")
    public RetResult<Object> get(){
        Subject subject = SecurityUtils.getSubject();
        String username = (String)subject.getPrincipal();
        try {
            User user = userService.getInfo(username);
            return RetResponse.makeOKRsp(starService.get(user.getUserID()));
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
}
