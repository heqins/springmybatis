package com.heqin.learnssm.mapper;

import com.heqin.learnssm.po.ItemsCustom;
import com.heqin.learnssm.po.ItemsQueryVo;

import java.util.List;

/**
 * Description:
 * Created by meko on 18-6-6上午5:25
 * Version 1.0
 */

public interface ItemsMapperCustom {
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}
