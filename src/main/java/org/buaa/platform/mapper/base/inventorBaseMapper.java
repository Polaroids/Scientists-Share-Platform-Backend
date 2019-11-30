package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.inventor;
/**
*  @author author
*/
public interface inventorBaseMapper {

    int insertinventor(inventor object);

    int updateinventor(inventor object);

    int update(inventor.UpdateBuilder object);

    List<inventor> queryinventor(inventor object);

    inventor queryinventorLimit1(inventor object);

}