package com.hz.ssm.controller;

import com.hz.ssm.pojo.Items;
import com.hz.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item")
public class ItemsController {

    //注入service
    @Autowired
    private ItemsService itemsService;
    /***
     * 根据主键Id查询
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/findItemsById")
    public Items findItemsById(Integer id){
        Items items =  itemsService.findItemsById(id);

        System.out.println("===========");
        System.out.println("item））））））））））））））））"+items);

        System.out.println("item"+items);

        System.out.println("item==============="+items);

        
        System.out.println("����ã��п���");
        
        System.out.println("乱码了，看不清楚，你说什么呀！！");
        
        System.out.println("��ô��˵��ѽ������");
        return items;
    }
}
