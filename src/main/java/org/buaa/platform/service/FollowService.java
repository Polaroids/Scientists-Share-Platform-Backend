package org.buaa.platform.service;

import org.buaa.platform.entity.Follow;
import org.buaa.platform.entity.Special;

import java.util.List;

public interface FollowService {
    public void add(String userID,String specialID);
    public void delete(String userID,String specialID);
    public List<Special> get(String userID);
}
