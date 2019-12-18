package org.buaa.platform.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.Follow;
/**
*  @author 
*/
@Mapper
public interface FollowBaseMapper {

    int insertFollow(Follow object);

    int updateFollow(Follow object);

    int update(Follow.UpdateBuilder object);

    List<Follow> queryFollow(Follow object);

    Follow queryFollowLimit1(Follow object);

}