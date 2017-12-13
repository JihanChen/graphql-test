package com.test.graph.controller;

import com.test.graph.entity.User;
import com.test.graph.result.Result;
import com.test.graph.service.UserService;
import com.test.graph.service.impl.GraphQLService;
import graphql.schema.GraphQLObjectType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

import static graphql.Scalars.GraphQLInt;
import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLObjectType.newObject;

/**
 *  用户管理
 */
@Controller
@RequestMapping("/graphql")
public class UserController {


   @Autowired
   private UserService userService;

    @Autowired
    private GraphQLService graphQLService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List list() {
        List<User> userList = userService.getUserList();
        return userList;
    }


    @ResponseBody
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public Result users(@RequestBody Map<String,String> query) {
        return new Result("0","ok",graphQLService.userresolve(query));
    }

    @ResponseBody
    @RequestMapping(value = "/adminusers",method = RequestMethod.POST)
    public Result adminusers(@RequestBody Map<String,String> query) {
        return new Result("0","ok",graphQLService.adminuserresolve(query));
    }

}
