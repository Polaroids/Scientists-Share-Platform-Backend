package org.buaa.platform.service.impl;

import org.buaa.platform.entity.Paper;
import org.buaa.platform.mapper.PaperMapper;
import org.buaa.platform.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaperImpl implements PaperService {
    @Autowired
    PaperMapper paperMapper;
    @Override
    public Paper getDetail(String paperID) throws Exception{
        Paper con = Paper.QueryBuild().paperID(paperID);
        Paper ans = paperMapper.queryPaperLimit1(con);
        if (ans == null)
            throw new Exception("论文不存在");
        ans.setViews(ans.getViews()+1);
        paperMapper.updatePaper(ans);
        return ans;
    }
}
