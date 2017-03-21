package com.search.dao.impl;

import com.search.dao.SearchPatent;
import com.search.domain.Patent;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Created by ltt on 2017/3/21.
 */
public class SearchPatentImpl implements SearchPatent {
    private MongoTemplate mongoTemplate;
    static final String USER_COLLECTION = "patent";

    public SearchPatentImpl() {

    }

    public MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }

    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Patent findPatent(String publishNo) {
        Patent a = mongoTemplate.findOne(Query.query(Criteria.where("publishNo").is(publishNo)),Patent.class,USER_COLLECTION);
        return a;
    }
}
