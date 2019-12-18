package org.buaa.platform.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.Authors;
/**
*  @author 
*/
@Mapper
public interface AuthorsBaseMapper {

    int insertAuthors(Authors object);

    int updateAuthors(Authors object);

    int update(Authors.UpdateBuilder object);

    List<Authors> queryAuthors(Authors object);

    Authors queryAuthorsLimit1(Authors object);

}