package com.test.graph.dao;

import com.test.graph.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> selectAll();
}