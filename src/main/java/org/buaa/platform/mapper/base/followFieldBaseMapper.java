package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.followField;
/**
*  @author author
*/
public interface followFieldBaseMapper {

    int insertfollowField(followField object);

    int updatefollowField(followField object);

    int update(followField.UpdateBuilder object);

    List<followField> queryfollowField(followField object);

    followField queryfollowFieldLimit1(followField object);

}