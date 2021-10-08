package com.hz.ssm.service;

import com.hz.ssm.dao.ItemsMapper;
import com.hz.ssm.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements  ItemsService{
    //注入mapper类
    @Autowired
    private ItemsMapper itemsMapper;

    public Items findItemsById(Integer id) {
    	System.out.println("service...............");
        return itemsMapper.selectByPrimaryKey(id);
    }
}
