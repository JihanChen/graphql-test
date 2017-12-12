package com.test.graph.service.impl;

import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by cjh on 2017/12/5.
 */

@Service
public class GraphQLService {

    @Autowired
    private GraphQL graphQL;

    public Object resolve(Map<String,String> query) {
        ExecutionResult executionResult = graphQL.execute(query.get("query"));
        return executionResult.getData();
    }
    

}
