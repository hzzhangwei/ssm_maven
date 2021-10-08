package com.hz.ssm.service;

import com.hz.ssm.pojo.Items;

public interface ItemsService {
    /**
     * 根据主键Id查询
     * @param id
     * @return
     */
    Items findItemsById(Integer id);
}
