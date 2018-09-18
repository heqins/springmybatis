package com.heqin.learnssm.service.Impl;


import com.heqin.learnssm.mapper.ItemsMapper;
import com.heqin.learnssm.mapper.ItemsMapperCustom;
import com.heqin.learnssm.po.Items;
import com.heqin.learnssm.po.ItemsCustom;
import com.heqin.learnssm.po.ItemsQueryVo;
import com.heqin.learnssm.service.ItemsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

// 商品管理
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        // 通过ItemsMapperCustom查询数据库
        // Vo从service传到DAO
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }
//
//    @Override
    public ItemsCustom findItemsById(Integer id) {
        System.out.print(id);
        Items items = itemsMapper.selectByPrimaryKey(Integer.valueOf(id));
        // 中间进行商品信息处理
        // ....
        // 返回ItemsCustom
        ItemsCustom itemsCustom = new ItemsCustom();
        // 将items里的属性值拷贝到itemsCustom里
        BeanUtils.copyProperties(items, itemsCustom);
        return  itemsCustom;
    }

//    @Override
//    public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
//        // 添加业务校验，通常咋service接口对关键参数进行检验
//        // 校验id是否为空
//        // 更新商品信息使用updateByPrimaryKeyWithBLOBS根据id更新items表中所有字段，包括大文本类型
//        itemsCustom.setId(id);
//        itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
//    }
}
