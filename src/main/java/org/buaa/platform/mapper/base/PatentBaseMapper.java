package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.Patent;
/**
*  @author 
*/
public interface PatentBaseMapper {

    int insertPatent(Patent object);

    int updatePatent(Patent object);

    int update(Patent.UpdateBuilder object);

    List<Patent> queryPatent(Patent object);

    Patent queryPatentLimit1(Patent object);

}