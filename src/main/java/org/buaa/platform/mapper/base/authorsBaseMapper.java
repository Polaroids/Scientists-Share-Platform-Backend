package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.authors;
/**
*  @author author
*/
public interface authorsBaseMapper {

    int insertauthors(authors object);

    int updateauthors(authors object);

    int update(authors.UpdateBuilder object);

    List<authors> queryauthors(authors object);

    authors queryauthorsLimit1(authors object);

}