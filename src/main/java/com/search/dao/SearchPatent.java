package com.search.dao;

import com.search.domain.Patent;

/**
 * Created by ltt on 2017/3/21.
 */
public interface SearchPatent {
    Patent findPatent(String publishNo);
}
