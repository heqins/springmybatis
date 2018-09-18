package com.heqin.learnssm.po;

import java.util.List;

/**
 * Description:
 * Created by meko on 18-6-6上午5:29
 * Version 1.0
 * 包装对象
 */

public class ItemsQueryVo {
    // 商品信息
    private Items items;

    // 为了系统可扩展性，对系统生成的po进行扩展
    private ItemsCustom itemsCustom;

    private List<ItemsCustom> itemsList;

    public List<ItemsCustom> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<ItemsCustom> itemsList) {
        this.itemsList = itemsList;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }
}
