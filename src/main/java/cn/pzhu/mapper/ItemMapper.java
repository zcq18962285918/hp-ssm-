package cn.pzhu.mapper;

import cn.pzhu.base.BaseDao;
import cn.pzhu.po.Item;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemMapper extends BaseDao<Item> {

	List<Item> listtj(@Param("list") List<Integer> types);
	
}
