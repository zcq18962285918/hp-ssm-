package cn.pzhu.service;

import cn.pzhu.base.BaseService;
import cn.pzhu.po.User;

public interface UserService extends BaseService<User> {
    User selectByUsername(String username);
}
