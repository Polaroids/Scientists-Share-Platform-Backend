package org.buaa.platform.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
    @Override
    public boolean register(String userName, String password, String email) throws Exception {
    	if (userName==null||userName.equals("")||password==null||password.equals("")||email==null||email=="")
            throw new Exception("用户名或密码或email不可为空");
    	User u = new User();
    	u.setUserName(userName);
    	List<User> ans = userMapper.queryUser(u);
    	//说明已经有人注册过了
    	if(ans.size() > 0) {
    		throw new Exception("用户名已注册");
    	}
    	u.setPassword(password);
    	u.setEmail(email);
    	u.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    	String userID = userMapper.queryCurUserID();
    	int uid = Integer.parseInt(userID) + 1;
    	userID = uid + "";
    	
    	u.setUserID(userID);
    	//此时要插入记录并且返回true
    	userMapper.insertUser(u);
    	return true;
    }
    
}
