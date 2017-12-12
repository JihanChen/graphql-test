package com.test.graph.service.impl;

import com.github.pagehelper.PageHelper;
import com.test.graph.dao.UserDAO;
import com.test.graph.entity.User;
import com.test.graph.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDAO userDAO;


    @Override
    public List<User> getUserList() {
        return userDAO.selectAll();
    }


}
