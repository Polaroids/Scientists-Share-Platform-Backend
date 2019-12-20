package org.buaa.platform.service.impl;

import org.buaa.platform.entity.Authors;
import org.buaa.platform.entity.Paper;
import org.buaa.platform.entity.Special;
import org.buaa.platform.entity.User;
import org.buaa.platform.mapper.AuthorsMapper;
import org.buaa.platform.mapper.PaperMapper;
import org.buaa.platform.mapper.SpecialMapper;
import org.buaa.platform.mapper.UserMapper;
import org.buaa.platform.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpecialImpl implements SpecialService {
    @Autowired
    SpecialMapper specialMapper;
    @Autowired
    AuthorsMapper authorsMapper;
    @Autowired
    PaperMapper paperMapper;
    @Autowired
    UserMapper userMapper;
    @Override
    public Special getDetail(String specialID) throws Exception {
        Special con = Special.QueryBuild().specialID(specialID);
        Special ans = specialMapper.querySpecialLimit1(con);
        if (ans == null)
            throw new Exception("专家不存在");
        return ans;
    }

    @Override
    public List<Paper> getPapers(String specialID) throws Exception {
        Authors con = Authors.QueryBuild().specialID(specialID);
        List<Authors> ans = authorsMapper.queryAuthors(con);
        String[] list = new String[ans.size()];
        for (int i = 0;i < list.length;i++){
            list[i] = ans.get(i).getPaperID();
        }
        Paper con1 = Paper.QueryBuild().paperIDList(list);
        return  paperMapper.queryPaper(Paper.QueryBuild().paperIDList(list));
    }

    @Override
    public Map<String,Object> search(String name, Integer crtPage, Integer pageSize){
        if (crtPage==null)
            crtPage = 0;
        if (pageSize==null)
            pageSize = 10;
        List<Special> list = specialMapper.querySpecial(Special.QueryBuild().fuzzyName(name));
        int st = crtPage * pageSize;
        int ed = st + pageSize < list.size() ? st + pageSize : list.size();
        Map<String,Object> map = new HashMap<>();
        map.put("totalPage",list.size()/pageSize + 1);
        map.put("crtPage",crtPage);
        map.put("list",list.subList(st,ed));
        return map;
    }

    @Override
    public void confirm(String userID, String specialID, String email) throws Exception{
        if (userID==null || userID.equals(""))
            throw new Exception("error userID");
        if (specialID==null||specialID.equals(""))
            throw new Exception("error specialID");
        if (email == null || email.equals(""))
            throw new Exception("error email");
        User user = new User();
        user.setUserID(userID);
        user.setSpecialID(specialID);
        userMapper.updateUser(user);
        Special special = new Special();
        special.setSpecialID(specialID);
        special.setEmail(email);
        special.setClaimed(1);
        specialMapper.updateSpecial(special);
    }
}
