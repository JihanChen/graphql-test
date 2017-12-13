package com.test.graph.fetchers;

import com.test.graph.dao.BaseDAO;
import com.test.graph.entity.AdminUser;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

/**
 * Created by cjh on 2017/12/13.
 */
public class AdminUserQuery implements DataFetcher<List<AdminUser>> {

    private BaseDAO baseDAO;
    public AdminUserQuery(BaseDAO baseDAO){
        this.baseDAO = baseDAO;
    }

    @Override
    public List<AdminUser> get(DataFetchingEnvironment environment) {
        return baseDAO.selectAll();
    }
}
