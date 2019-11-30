package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.Special;
/**
*  @author author
*/
public interface SpecialBaseMapper {

    int insertSpecial(Special object);

    int updateSpecial(Special object);

    int update(Special.UpdateBuilder object);

    List<Special> querySpecial(Special object);

    Special querySpecialLimit1(Special object);

}