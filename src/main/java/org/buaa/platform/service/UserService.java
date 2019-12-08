package org.buaa.platform.service;

import org.springframework.stereotype.Service;

public interface UserService {
    boolean login(String userName,String password)throws Exception;
    
    boolean register(String userName, String password, String email)throws Exception;
}
