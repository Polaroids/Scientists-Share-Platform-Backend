package org.buaa.platform.service.impl;

import org.buaa.platform.entity.Follow;
import org.buaa.platform.entity.Special;
import org.buaa.platform.mapper.FollowMapper;
import org.buaa.platform.mapper.SpecialMapper;
import org.buaa.platform.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowImpl implements FollowService {
    @Autowired
    FollowMapper followMapper;
    @Autowired
    SpecialMapper specialMapper;
    @Override
    public void add(String userID, String specialID) {
        Follow con = new Follow();
        con.setSpecialID(specialID);
        con.setUserID(userID);
        Follow res = followMapper.queryFollowLimit1(Follow.QueryBuild().specialID(specialID).userID(userID));
        if (res == null){
            followMapper.insertFollow(con);
        }
    }

    @Override
    public void delete(String userID, String specialID) {
        followMapper.deleteFollow(specialID,userID);
    }

    @Override
    public List<Special> get(String userID) {
        return followMapper.get(userID);
    }
}
