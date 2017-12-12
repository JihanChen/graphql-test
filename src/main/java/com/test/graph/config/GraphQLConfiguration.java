package com.test.graph.config;

import com.test.graph.resolve.Query;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.coxautodev.graphql.tools.SchemaParser.newParser;
/**
 * Created by cjh on 2017/12/5.
 */
@Configuration
public class GraphQLConfiguration {

    @Autowired
    private Query query;

    @Bean
    public GraphQL graphQL() {
        return GraphQL.newGraphQL(graphQLSchema())
                .build();
    }

    @Bean
    public GraphQLSchema graphQLSchema() {
        return newParser()
                .file("users.graphqls")
                .resolvers(query)
                .build()
                .makeExecutableSchema();
    }


}
