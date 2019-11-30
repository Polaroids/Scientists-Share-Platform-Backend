package org.buaa.platform.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buaa.platform.entity.PutawayPatent;
/**
*  @author author
*/
public interface PutawayPatentBaseMapper {

    int insertPutawayPatent(PutawayPatent object);

    int updatePutawayPatent(PutawayPatent object);

    int update(PutawayPatent.UpdateBuilder object);

    List<PutawayPatent> queryPutawayPatent(PutawayPatent object);

    PutawayPatent queryPutawayPatentLimit1(PutawayPatent object);

}