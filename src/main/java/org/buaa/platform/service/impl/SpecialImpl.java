package org.buaa.platform.service.impl;

import org.buaa.platform.entity.Authors;
import org.buaa.platform.entity.Paper;
import org.buaa.platform.entity.Special;
import org.buaa.platform.mapper.AuthorsMapper;
import org.buaa.platform.mapper.PaperMapper;
import org.buaa.platform.mapper.SpecialMapper;
import org.buaa.platform.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialImpl implements SpecialService {
    @Autowired
    SpecialMapper specialMapper;
    @Autowired
    AuthorsMapper authorsMapper;
    @Autowired
    PaperMapper paperMapper;
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
}
