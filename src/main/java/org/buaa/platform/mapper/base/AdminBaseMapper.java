package org.buaa.platform.mapper.base;

import java.util.List;

import org.buaa.platform.entity.Admin;
/**
*  @author author
*/
public interface AdminBaseMapper {

    int insertAdmin(Admin object);

    int updateAdmin(Admin object);

    int update(Admin.UpdateBuilder object);

    List<Admin> queryAdmin(Admin object);

    Admin queryAdminLimit1(Admin object);

}