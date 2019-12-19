package org.buaa.platform.service.impl;

import org.buaa.platform.entity.Paper;
import org.buaa.platform.entity.Star;
import org.buaa.platform.mapper.StarMapper;
import org.buaa.platform.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarImpl implements StarService {
    @Autowired
    StarMapper starMapper;
    @Override
    public void add(String userID,String paperID) throws Exception{
        if (userID==null || paperID==null||userID.equals("")||paperID.equals("")){
            throw new Exception("paperID和userID不可为空");
        }
        Star star = starMapper.queryStarLimit1(Star.QueryBuild().paperID(paperID).userID(userID));
        if (star == null){
            star = new Star();
            star.setPaperID(paperID);
            star.setUserID(userID);
            starMapper.insertStar(star);
        }
    }

    @Override
    public void cancel(String userID,String paperID) {
        starMapper.cancel(userID,paperID);
    }

    @Override
    public List<Paper> get(String userID) {
        return starMapper.get(userID);
    }
}
