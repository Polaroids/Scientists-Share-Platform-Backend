package org.buaa.platform.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.Paper;
/**
*  @author 
*/
@Mapper
public interface PaperBaseMapper {

    int insertPaper(Paper object);

    int updatePaper(Paper object);

    int update(Paper.UpdateBuilder object);

    List<Paper> queryPaper(Paper object);

    Paper queryPaperLimit1(Paper object);

}