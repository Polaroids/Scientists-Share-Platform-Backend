package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.CertificationAudit;
/**
*  @author author
*/
public interface CertificationAuditBaseMapper {

    int insertCertificationAudit(CertificationAudit object);

    int updateCertificationAudit(CertificationAudit object);

    int update(CertificationAudit.UpdateBuilder object);

    List<CertificationAudit> queryCertificationAudit(CertificationAudit object);

    CertificationAudit queryCertificationAuditLimit1(CertificationAudit object);

}