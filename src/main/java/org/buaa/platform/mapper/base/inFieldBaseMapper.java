package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.inField;
/**
*  @author author
*/
public interface inFieldBaseMapper {

    int insertinField(inField object);

    int updateinField(inField object);

    int update(inField.UpdateBuilder object);

    List<inField> queryinField(inField object);

    inField queryinFieldLimit1(inField object);

}