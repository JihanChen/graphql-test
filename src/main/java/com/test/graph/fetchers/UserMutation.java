package com.test.graph.fetchers;

import com.test.graph.entity.User;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

/**
 * Created by cjh on 2018/1/8.
 */
public class UserMutation implements DataFetcher<User> {
    @Override
    public User get(DataFetchingEnvironment environment) {
        User user =  new User();
        user.setName(environment.getArgument("mobile"));
        user.setMobile(environment.getArgument("name"));
        return user;
    }
}
