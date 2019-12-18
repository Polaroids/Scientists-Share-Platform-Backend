package org.buaa.platform.service;

import org.apache.shiro.authc.AuthenticationException;
import org.buaa.platform.entity.User;

public interface UserService {
    public boolean login(String userName,String password)throws AuthenticationException;
    
    public boolean register(String userName, String password, String email)throws Exception;

    public User getInfo(String userName)throws Exception;
}
