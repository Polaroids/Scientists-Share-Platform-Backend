package org.buaa.platform.controller;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.buaa.platform.service.UserService;
import org.buaa.platform.tool.RetResponse;
import org.buaa.platform.tool.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping({"/api/user/"})
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping({"login"})
    public RetResult<Object> login(String userName, String password){
        if (userName==null||password==null)
            return RetResponse.makeErrRsp("用户名或密码不可为空");
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        // 执行认证登陆
        try {
            subject.login(token);
        } catch (UnknownAccountException uae) {
            return RetResponse.makeErrRsp("未知账户");
        } catch (IncorrectCredentialsException ice) {
            return RetResponse.makeErrRsp("密码不正确");
        } catch (LockedAccountException lae) {
            return RetResponse.makeErrRsp("账户已锁定");
        } catch (ExcessiveAttemptsException eae) {
            return RetResponse.makeErrRsp("用户名或密码错误次数过多");
        } catch (AuthenticationException ae) {
            return RetResponse.makeErrRsp(ae.getMessage());
        }
        if (subject.isAuthenticated()) {
            return RetResponse.makeOKRsp();
        } else {
            token.clear();
            return RetResponse.makeErrRsp("登录失败");
        }
    }
    
    @PostMapping({"register"})
    public RetResult<Object> register(String userName, String password, String email){
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
    @GetMapping(value = "/person")
    public RetResult<Object> person(){
        Subject subject = SecurityUtils.getSubject();
        String username = (String)subject.getPrincipal();
        try {
            return RetResponse.makeOKRsp(userService.getInfo(username));
        }
        catch (Exception e){
            return RetResponse.makeErrRsp(e.getMessage());
        }
    }
}
