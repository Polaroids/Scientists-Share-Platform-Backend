package org.buaa.platform.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.buaa.platform.mapper.base.UserBaseMapper;

@Mapper
public interface UserMapper extends UserBaseMapper {
    Integer getTotal();
}
