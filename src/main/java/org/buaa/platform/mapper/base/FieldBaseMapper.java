package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.Field;
/**
*  @author author
*/
public interface FieldBaseMapper {

    int insertField(Field object);

    int updateField(Field object);

    int update(Field.UpdateBuilder object);

    List<Field> queryField(Field object);

    Field queryFieldLimit1(Field object);

}