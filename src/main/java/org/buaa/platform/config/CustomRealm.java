package org.buaa.platform.config;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.buaa.platform.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;


public class CustomRealm extends AuthorizingRealm {
    private final static Logger logger = LoggerFactory.getLogger(AuthorizingRealm.class);
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> stringSet = new HashSet<>();
        stringSet.add("user");
        info.setRoles(stringSet);
        return info;
    }

    @Autowired
    private UserService userService;
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("-------身份认证方法--------");
        String userName = (String) authenticationToken.getPrincipal();
        String userPassword = new String((char[]) authenticationToken.getCredentials());
        //根据用户名从数据库获取密码
        userService.login(userName,userPassword);
        return new SimpleAuthenticationInfo(userName, userPassword,getName());
    }
}
