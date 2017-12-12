package com.test.graph.resolve;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.test.graph.dao.AdminUserDAO;
import com.test.graph.dao.UserDAO;
import com.test.graph.entity.AdminUser;
import com.test.graph.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cjh on 2017/12/5.
 */
@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private AdminUserDAO adminUserDAO;

    public List<AdminUser> adminUsers() {
        return adminUserDAO.selectAll();
    }
    public List<User> users() {
        return userDAO.selectAll();
    }



}
