package com.search.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by happyFamily on 2017/3/20.
 */
@Document
public class Patent {
    @Id
    private ObjectId Id;
    private String appNo;
    private String publishNo;
    private String patentName;
    private String patentType;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:ss:mm")
    private Date publishDate;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:ss:mm")
    private Date appDate;
    private String[] appPerson;
    private String[] inventPerson;
    private String address;
    @Field("abstract")
    private String patentaAbstract;
    private String proxyOrg;
    private String proxyPerson;
    private Integer ipc;
    private Integer priority;
    private Integer appType;
    private Integer status;

    public ObjectId getId() {
        return Id;
    }

    public void setId(ObjectId id) {
        Id = id;
    }

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    public String getPublishNo() {
        return publishNo;
    }

    public void setPublishNo(String publishNo) {
        this.publishNo = publishNo;
    }

    public String getPatentName() {
        return patentName;
    }

    public void setPatentName(String patentName) {
        this.patentName = patentName;
    }

    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }

    public String[] getAppPerson() {
        return appPerson;
    }

    public void setAppPerson(String[] appPerson) {
        this.appPerson = appPerson;
    }

    public String[] getInventPerson() {
        return inventPerson;
    }

    public void setInventPerson(String[] inventPerson) {
        this.inventPerson = inventPerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPatentaAbstract() {
        return patentaAbstract;
    }

    public void setPatentaAbstract(String patentaAbstract) {
        this.patentaAbstract = patentaAbstract;
    }

    public String getProxyOrg() {
        return proxyOrg;
    }

    public void setProxyOrg(String proxyOrg) {
        this.proxyOrg = proxyOrg;
    }

    public String getProxyPerson() {
        return proxyPerson;
    }

    public void setProxyPerson(String proxyPerson) {
        this.proxyPerson = proxyPerson;
    }

    public Integer getIpc() {
        return ipc;
    }

    public void setIpc(Integer ipc) {
        this.ipc = ipc;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
