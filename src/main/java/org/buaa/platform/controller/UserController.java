package org.buaa.platform.controller;



import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.CorsFilter;
import org.buaa.platform.service.UserService;
import org.buaa.platform.tool.RetResponse;
import org.buaa.platform.tool.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


@RestController
@RequestMapping({"/api/user/"})
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping({"login"})
    public RetResult<Object> login(String userName, String password, HttpServletResponse response){
    	response.setHeader("Access-Control-Allow-Origin", "*");
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
    
    @RequestMapping({"register"})
    public RetResult<Object> register(String userName, String password, String email, HttpServletResponse response){
    	response.setHeader("Access-Control-Allow-Origin", "*");
    	try {   	
            if (userService.register(userName, password, email)) {
                return RetResponse.makeOKRsp();
            }
            return RetResponse.makeErrRsp("注册失败");
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
}
