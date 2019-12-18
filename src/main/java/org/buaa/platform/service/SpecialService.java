package org.buaa.platform.service;

import org.buaa.platform.entity.Paper;
import org.buaa.platform.entity.Special;

import java.util.List;

public interface SpecialService {
    public Special getDetail(String specialID)throws Exception;
    public List<Paper> getPapers(String specialID) throws Exception;
}
