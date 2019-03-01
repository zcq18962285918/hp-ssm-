package cn.pzhu.service;

import cn.pzhu.base.BaseDao;
import cn.pzhu.base.BaseServiceImpl;
import cn.pzhu.mapper.ScMapper;
import cn.pzhu.po.Sc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScServiceImpl extends BaseServiceImpl<Sc> implements ScService {

    @Autowired
    private ScMapper scMapper;

    @Override
    public BaseDao<Sc> getBaseDao() {
        return scMapper;
    }

}
