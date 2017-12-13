package com.test.graph.dao;

import java.util.List;

/**
 * Created by cjh on 2017/12/13.
 */
public interface BaseDAO<T> {

    List<T> selectAll();
}
