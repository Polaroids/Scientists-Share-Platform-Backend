package org.buaa.platform.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.Star;
/**
*  @author 
*/
@Mapper
public interface StarBaseMapper {

    int insertStar(Star object);

    int updateStar(Star object);

    int update(Star.UpdateBuilder object);

    List<Star> queryStar(Star object);

    Star queryStarLimit1(Star object);

}