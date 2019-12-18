package org.buaa.platform.service;

import org.buaa.platform.entity.Institution;

public interface InstitutionService {
    Institution getDetail(String name)throws Exception;
}
