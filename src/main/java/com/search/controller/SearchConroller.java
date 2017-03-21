package com.search.controller;

import static com.mongodb.client.model.Filters.in;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.search.dao.SearchPatent;
import com.search.domain.Patent;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ltt on 2017/3/21.
 */
@Controller()
@RequestMapping(path="/search")
public class SearchConroller {
    private SearchPatent searchDao;

    @Autowired
    public SearchConroller(SearchPatent searchDao) {
        this.searchDao = searchDao;
    }

    @RequestMapping(path="/test")
    public String searchTest(Model model){
       /*MongoDatabase database =  mongoTemplate.getDatabase("sopatent");
        MongoCollection coll =  database.getCollection("patent");
        //new Document("publishNo","CN300936004")
        //in("publishNo","CN300936004")
        Collection doc = coll.find(new Document("publishNo","CN300936004")).into(new ArrayList<Document>());
        Object[]  a =doc.toArray();

        model.addAttribute("a" ,a );*/
        Patent a  =searchDao.findPatent("CN300936004");
        System.out.println(a.getId());
        System.out.println(a.getPatentName());
        model.addAttribute("a" ,a );
        return "index";
    }
}
