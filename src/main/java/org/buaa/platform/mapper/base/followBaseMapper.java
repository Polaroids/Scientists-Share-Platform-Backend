package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.follow;
/**
*  @author author
*/
public interface followBaseMapper {

    int insertfollow(follow object);

    int updatefollow(follow object);

    int update(follow.UpdateBuilder object);

    List<follow> queryfollow(follow object);

    follow queryfollowLimit1(follow object);

}