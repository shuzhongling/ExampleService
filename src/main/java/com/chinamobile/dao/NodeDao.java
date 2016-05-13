package com.chinamobile.dao;

import com.chinamobile.model.Node;
import org.apache.ibatis.annotations.Param;

/**
 * Created by szl on 2016/5/12.
 */
public interface NodeDao {

    Node getById(@Param("id") String id, @Param("streamId") String streamId);

}
