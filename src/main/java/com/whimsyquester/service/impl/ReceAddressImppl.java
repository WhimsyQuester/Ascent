/*
 * @Description: 实现接口ReceAddressInter的Java类,用于对收货地址进行查询和更新的操作
 * @FilePath: \src\main\java\com\whimsyquester\service\impl\ReceAddressImppl.java
 * @Author: whimsyquester rongquanhuang01@gmail.com
 * @Date: 2023-06-05 11:32:03
 * @LastEditors: whimsyquester rongquanhuang01@gmail.com
 * @LastEditTime: 2023-06-06 22:51:22
 * Copyright (c) 2023 by whimsyquester , All Rights Reserved.
 */
package com.whimsyquester.service.impl;

import com.alibaba.fastjson.JSON;
import com.whimsyquester.dao.ReceAddressMapper;
import com.whimsyquester.po.ReceAddress;
import com.whimsyquester.service.inter.ReceAddressInter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class ReceAddressImppl implements ReceAddressInter {
    // 使用@Autowired注解,自动装配ReceAddressMapper类的实例
    @Autowired
    private ReceAddressMapper receMapper;

    // 实现了getByIdAddress方法,用于查询指定id的收货地址信息
    @Override
    public String getByIdAddress(Integer id) throws Exception {
        // 通过调用ReceAddressMapper中的getAddress方法,查询指定id的收货地址信息
        ReceAddress address = receMapper.getAddress(id);
        // 将结果转换为JSON格式返回
        return JSON.toJSONString(address);
    }

    // 实现了updateAddress方法,用于更新收货地址信息
    @Override
    public String updateAddress(ReceAddress address) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        // 如果传入的收货地址对象为空,则返回-1
        if (address == null) {
            map.put("state", "-1");
        } else {
            // 否则通过调用ReceAddressMapper中的updateAddress方法,更新收货地址信息
            int num = receMapper.updateAddress(address);
            if (num > 0) {
                map.put("state", "1");
            }
        }
        // 将结果转换为JSON格式返回
        return JSON.toJSONString(map);
    }

}

