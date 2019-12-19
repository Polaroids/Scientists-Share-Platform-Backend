package org.buaa.platform.service;

import org.buaa.platform.entity.Paper;

import java.util.List;

public interface StarService {
    void add( String userID,String paperID)throws Exception;
    void cancel(String userID,String paperID);
    List<Paper> get(String userID);

}
