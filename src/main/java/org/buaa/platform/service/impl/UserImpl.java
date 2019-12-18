package org.buaa.platform.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
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
    public boolean login(String userName, String password) throws AuthenticationException {
        if (userName==null||userName.equals("")||password==null||password.equals(""))
            throw new AuthenticationException("用户名或密码不可为空");
        User condition = User.QueryBuild().userName(userName).password(password).build();
        if (userMapper.queryUserLimit1(condition) == null)
        	throw new AuthenticationException("用户名或密码错误");
        return true;
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
    	if (userMapper.queryUserLimit1(User.QueryBuild().email(email)) != null)
			throw new Exception("email已被注册");
    	u.setPassword(password);
    	u.setEmail(email);
    	u.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    	int userID = userMapper.queryCurUserID();
    	int uid = userID + 1;
    	
    	u.setUserID(String.valueOf(uid));
    	//此时要插入记录并且返回true
    	userMapper.insertUser(u);
    	return true;
    }

	@Override
	public User getInfo(String userName) throws Exception {
    	User con = User.QueryBuild().userName(userName);
    	User ans = userMapper.queryUserLimit1(con);
		if (ans == null) {
			throw new Exception("不存在的用户");
		}
		return ans;
	}
}
