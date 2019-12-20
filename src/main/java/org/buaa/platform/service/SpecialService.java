package org.buaa.platform.service;

import org.buaa.platform.entity.Paper;
import org.buaa.platform.entity.Special;

import java.util.List;
import java.util.Map;

public interface SpecialService {
    public Special getDetail(String specialID)throws Exception;
    public List<Paper> getPapers(String specialID) throws Exception;
    public Map<String,Object> search(String name, Integer crtPage, Integer pageSize);
    public void confirm(String userID,String specialID,String email)throws Exception;
}
