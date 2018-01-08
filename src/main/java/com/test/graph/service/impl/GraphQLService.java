package com.test.graph.service.impl;

import graphql.ExecutionInput;
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
    @Qualifier("userGraphQL")
    private GraphQL userGraphQL;

    @Autowired
    @Qualifier("adminUserGraphQL")
    private GraphQL adminUserGraphQL;


    public Object userresolve(Map<String,Object> requestParam) {

        Map<String, Object> variables = (Map<String, Object>) requestParam.get("variables");

        ExecutionInput executionInput = ExecutionInput.newExecutionInput()
                .query(requestParam.get("query").toString())
                .variables(variables)
                .build();

        ExecutionResult executionResult = userGraphQL.execute(executionInput);
        return executionResult.getData();
    }

    public Object adminuserresolve(Map<String,String> query) {
        ExecutionResult executionResult = adminUserGraphQL.execute(query.get("query"));
        return executionResult.getData();
    }


    public Object adduserresolve(Map<String,String> query) {
        ExecutionInput executionInput = new ExecutionInput(query.get("mutation"),null,null,null,null);
        ExecutionResult executionResult = userGraphQL.execute(executionInput);
        return executionResult.getData();
    }
}
