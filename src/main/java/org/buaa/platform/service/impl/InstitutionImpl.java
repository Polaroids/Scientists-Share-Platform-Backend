package org.buaa.platform.service.impl;

import org.buaa.platform.entity.Institution;
import org.buaa.platform.mapper.InstitutionMapper;
import org.buaa.platform.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutionImpl implements InstitutionService {
    @Autowired
    InstitutionMapper institutionMapper;
    @Override
    public Institution getDetail(String name) throws Exception {
        Institution con = Institution.QueryBuild().institutionName(name);
        Institution ans = institutionMapper.queryInstitutionLimit1(con);
        System.out.println(name);
        if (ans == null)
            throw new Exception("机构不存在");
        return ans;
    }
}
