package com.heqin.learnssm.service;

import com.heqin.learnssm.exception.CustomException;
import com.heqin.learnssm.po.ItemsCustom;
import com.heqin.learnssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsService {
    // 商品查询列表
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
//
//    // 根据id查询商品信息
    public ItemsCustom findItemsById(Integer id) throws Exception;
//
//    // 修改商品信息
//    public void updateItems(Integer id, ItemsCustom itemsCustom) throws exception;
}
