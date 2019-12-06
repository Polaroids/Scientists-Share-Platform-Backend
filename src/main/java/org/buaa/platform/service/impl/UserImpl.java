package org.buaa.platform.service.impl;

import org.buaa.platform.entity.User;
import org.buaa.platform.mapper.UserMapper;
import org.buaa.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean login(String userName, String password) throws Exception{
        if (userName==null||userName.equals("")||password==null||password.equals(""))
            throw new Exception("用户名或密码不可为空");
        User condition = User.QueryBuild().userName(userName).password(password).build();
        return userMapper.queryUser(condition).size()!=0 ;
    }
}
