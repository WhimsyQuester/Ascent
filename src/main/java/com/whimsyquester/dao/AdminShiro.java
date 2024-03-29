/*
 * @Description: 定义了一个Java接口AdminShiro,用于访问数据库中的管理员权限信息
 * @FilePath: \src\main\java\com\whimsyquester\dao\AdminShiro.java
 * @Author: whimsyquester rongquanhuang01@gmail.com
 * @Date: 2023-06-05 11:32:03
 * @LastEditors: WhimsyQuester rongquanhuang01@gmail.com
 * @LastEditTime: 2023-11-26 03:29:42
 * Copyright (c) 2023 by whimsyquester , All Rights Reserved.
 */
package com.whimsyquester.dao;

import com.whimsyquester.po.AdminShiroS;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminShiro {

    // 查询所有权限,返回一个AdminShiroS类型的List集合
    List<AdminShiroS> ShiroGets() throws Exception;

    // 更新管理员权限,接收两个参数shiroId和userId,分别表示权限ID和用户ID,返回一个int类型的值
    int AdminUpdateShiro(@Param("shiroId") Integer shiroId, @Param("userId") Integer userId) throws Exception;

}

