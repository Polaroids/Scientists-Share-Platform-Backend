package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.inInstitution;
/**
*  @author author
*/
public interface inInstitutionBaseMapper {

    int insertinInstitution(inInstitution object);

    int updateinInstitution(inInstitution object);

    int update(inInstitution.UpdateBuilder object);

    List<inInstitution> queryinInstitution(inInstitution object);

    inInstitution queryinInstitutionLimit1(inInstitution object);

}