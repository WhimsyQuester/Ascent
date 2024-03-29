/*
 * @Description: Java接口,定义了购物车相关的服务接口
 * @FilePath: \src\main\java\com\whimsyquester\service\inter\CartServiceInter.java
 * @Author: whimsyquester rongquanhuang01@gmail.com
 * @Date: 2023-06-05 11:32:03
 * @LastEditors: whimsyquester rongquanhuang01@gmail.com
 * @LastEditTime: 2023-06-06 17:10:08
 * Copyright (c) 2023 by whimsyquester , All Rights Reserved.
 */
package com.whimsyquester.service.inter;

import com.whimsyquester.po.GoodsCart;

public interface CartServiceInter {

    // 添加购物车:接收一个GoodsCart对象作为参数,返回一个String类型的值表示添加购物车的结果
    String addCart(GoodsCart cart) throws Exception;

    // 查找购物车:接收一个Integer类型的参数id,返回一个String类型的值表示查找到的购物车信息的JSON格式字符串
    String findUserIdC(Integer id) throws Exception;

    // 删除购物车:接收一个Integer类型的参数id,返回一个String类型的值表示删除购物车的结果
    String delByid(Integer id) throws Exception;

    // 批量删除购物车:接收一个String类型的参数str,返回一个String类型的值表示批量删除购物车的结果。
    String delByIdS(String str);

}

