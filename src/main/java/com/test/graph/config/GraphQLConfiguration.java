package com.test.graph.config;

import com.test.graph.dao.AdminUserDAO;
import com.test.graph.dao.UserDAO;
import graphql.GraphQL;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;
import java.io.InputStreamReader;
/**
 * Created by cjh on 2017/12/5.
 */
@Configuration
public class GraphQLConfiguration {

    private static final String USER_GRAPHQL_SCHEMA_IDL = "users.graphqls";
    private static final String ADMINUSER_GRAPHQL_SCHEMA_IDL = "adminusers.graphqls";

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private AdminUserDAO adminUserDAO;

    @Bean
    public GraphQL userGraphQL() {

        return generateGraphQL(USER_GRAPHQL_SCHEMA_IDL,UserRuntimeWiringFactory.getRuntimeWiring(userDAO));
    }
    @Bean
    public GraphQL adminUserGraphQL() {

        return generateGraphQL(ADMINUSER_GRAPHQL_SCHEMA_IDL,AdminUserRuntimeWiringFactory.getRuntimeWiring(adminUserDAO));
    }



    private GraphQL generateGraphQL(String userGraphqlSchemaIdl,RuntimeWiring runtimeWiring) {
        final SchemaParser schemaParser = new SchemaParser();
        final TypeDefinitionRegistry registry;
        try (final InputStream inputStream = getClass().getClassLoader().getResourceAsStream(userGraphqlSchemaIdl);
             final InputStreamReader streamReader = new InputStreamReader(inputStream)) {
            registry = schemaParser.parse(streamReader);
        } catch (Exception e) {
            throw new IllegalStateException("Could not parse graphql schema", e);
        }
        SchemaGenerator schemaGenerator = new SchemaGenerator();
        return GraphQL.newGraphQL(schemaGenerator.makeExecutableSchema(registry, runtimeWiring)).build();
    }


}
