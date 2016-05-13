package com.chinamobile.service;

import com.chinamobile.dao.NodeDao;
import com.chinamobile.model.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by szl on 2016/5/12.
 */
@RestController
public class NodeService {

    @Autowired
    private NodeDao dao;

    @RequestMapping(value = "nodes", method = RequestMethod.GET)
    private Node getNode(@RequestParam("id") String nodeId,
                         @RequestParam("stream") String streamId){
        return dao.getById(nodeId, streamId);
    }

}
