package org.buaa.platform.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.buaa.platform.entity.User;
import org.buaa.platform.service.FollowService;
import org.buaa.platform.service.UserService;
import org.buaa.platform.tool.RetResponse;
import org.buaa.platform.tool.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/api/follow/"})
public class FollowController {
    @Autowired
    UserService userService;
    @Autowired
    FollowService followService;
    @PostMapping({"add"})
    public RetResult<Object> add(String specialID){
        Subject subject = SecurityUtils.getSubject();
        String username = (String)subject.getPrincipal();
        try {
            User user = userService.getInfo(username);
            followService.add(user.getUserID(),specialID);
            return RetResponse.makeOKRsp();
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
    @PostMapping({"cancel"})
    public RetResult<Object> cancel(String specialID){
        Subject subject = SecurityUtils.getSubject();
        String username = (String)subject.getPrincipal();
        try {
            User user = userService.getInfo(username);
            followService.delete(user.getUserID(),specialID);
            return RetResponse.makeOKRsp();
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
    @GetMapping(value = "/get")
    public RetResult<Object> get(){
        Subject subject = SecurityUtils.getSubject();
        String username = (String)subject.getPrincipal();
        try {
            User user = userService.getInfo(username);
            return RetResponse.makeOKRsp(followService.get(user.getUserID()));
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
}
