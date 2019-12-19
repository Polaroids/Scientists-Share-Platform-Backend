package org.buaa.platform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.buaa.platform.entity.Paper;
import org.buaa.platform.entity.Star;
import org.buaa.platform.mapper.base.StarBaseMapper;
/**
*  @author 
*/
@Mapper
public interface StarMapper extends StarBaseMapper{
    void cancel(String userID,String paperID);

    @Select("select * from Star,Paper where Star.paperID = Paper.paperID and Star.userID = #{userID};")
    public List<Paper> get(String userID);
}