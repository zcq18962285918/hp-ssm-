package cn.pzhu.service;

import cn.pzhu.base.BaseDao;
import cn.pzhu.base.BaseServiceImpl;
import cn.pzhu.mapper.AddressMapper;
import cn.pzhu.po.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends BaseServiceImpl<Address> implements AddressService {


    @Autowired
    private AddressMapper addressMapper;


    @Override
    public BaseDao<Address> getBaseDao() {
        return null;
    }

}
