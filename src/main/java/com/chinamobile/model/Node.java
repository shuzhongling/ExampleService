package com.chinamobile.model;

import java.util.Date;

/**
 * Created by szl on 2016/5/12.
 */
public class Node {
    private String nodeId;
    private String name;
    private String apiKey;
    private String streamId;
    private Date lastExtractTime;
    private String descr;
    private int status;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public Date getLastExtractTime() {
        return lastExtractTime;
    }

    public void setLastExtractTime(Date lastExtractTime) {
        this.lastExtractTime = lastExtractTime;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nodeId='" + nodeId + '\'' +
                ", name='" + name + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", streamId='" + streamId + '\'' +
                ", lastExtractTime=" + lastExtractTime +
                ", descr='" + descr + '\'' +
                ", status=" + status +
                '}';
    }
}
