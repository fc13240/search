package com.search.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by happyFamily on 2017/3/20.
 */
@Document(collection = "patent")
public class Patent {
    @Id
    private ObjectId Id;
    private String appNo;
    private String publishNo;
    private String patentName;
    private String patentType;
    private String publishDate;
    private String appDate;
    private String appPerson;
    private String inventPerson;
    private String address;
    @Field("abstract")
    private String patentaAbstract;
    private String proxyOrg;
    private String proxyPerson;
    private Integer ipc;
    private int priority;
    private int appType;
    private int status;



}
