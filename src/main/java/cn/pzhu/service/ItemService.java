package cn.pzhu.service;

import cn.pzhu.base.BaseService;
import cn.pzhu.po.Item;
import cn.pzhu.utils.Pager;

import java.util.List;

public interface ItemService extends BaseService<Item> {

    Pager<Item> solrFind(Item item, String condition);

    List<Item> listtj(List<Integer> types);


}
