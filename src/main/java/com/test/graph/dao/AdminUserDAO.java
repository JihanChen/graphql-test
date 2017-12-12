package com.test.graph.dao;

import com.test.graph.entity.AdminUser;

import java.util.List;

public interface AdminUserDAO{

   /**
    * 根据用户名称查询后台管理用户信息
    * @param username
    * @return 后台管理用户
     */
   AdminUser selectByName(String username);


   /**
    * 根据用户名称查询后台管理用户信息
    * @return 后台管理用户
    */
   List<AdminUser> selectAll();

}