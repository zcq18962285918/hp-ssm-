package cn.pzhu.service;

import cn.pzhu.base.BaseDao;
import cn.pzhu.base.BaseServiceImpl;
import cn.pzhu.mapper.OrderDetailMapper;
import cn.pzhu.po.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends BaseServiceImpl<OrderDetail> implements OrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public BaseDao<OrderDetail> getBaseDao() {
        return orderDetailMapper;
    }

}
