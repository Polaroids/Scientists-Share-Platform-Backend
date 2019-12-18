package org.buaa.platform.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.Institution;
/**
*  @author author
*/
@Mapper
public interface InstitutionBaseMapper {

    int insertInstitution(Institution object);

    int updateInstitution(Institution object);

    int update(Institution.UpdateBuilder object);

    List<Institution> queryInstitution(Institution object);

    Institution queryInstitutionLimit1(Institution object);

}