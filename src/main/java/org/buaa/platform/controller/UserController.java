package org.buaa.platform.controller;



import org.buaa.platform.service.UserService;
import org.buaa.platform.tool.RetResponse;
import org.buaa.platform.tool.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/api/user/"})
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping({"login"})
    public RetResult<Object> login(String userName, String password){
        try {
            if (userService.login(userName, password)) {
                return RetResponse.makeOKRsp();
            }
            return RetResponse.makeErrRsp("用户名或密码错误");
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
}
