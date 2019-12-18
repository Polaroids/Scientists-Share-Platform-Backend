package org.buaa.platform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.buaa.platform.entity.Follow;
import org.buaa.platform.entity.Special;
import org.buaa.platform.mapper.base.FollowBaseMapper;
/**
*  @author 
*/
@Mapper
public interface FollowMapper extends FollowBaseMapper{
    void deleteFollow(String specialID,String userID);

    @Select("select * from Follow,Special where Follow.specialID = Special.specialID and Follow.userID = #{userID};")
    public List<Special> get(String userID);
}