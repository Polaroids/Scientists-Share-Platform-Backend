package org.buaa.platform.service;

import org.buaa.platform.entity.Paper;

public interface PaperService {
    Paper getDetail(String paperID)throws Exception;
}
