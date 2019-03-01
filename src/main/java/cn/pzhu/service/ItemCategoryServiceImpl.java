package cn.pzhu.service;

import cn.pzhu.base.BaseDao;
import cn.pzhu.base.BaseServiceImpl;
import cn.pzhu.mapper.ItemCategoryMapper;
import cn.pzhu.po.ItemCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCategoryServiceImpl extends BaseServiceImpl<ItemCategory> implements ItemCategoryService {

    @Autowired
    private ItemCategoryMapper itemCategoryMapper;

    @Override
    public BaseDao<ItemCategory> getBaseDao() {
        return itemCategoryMapper;
    }

}
