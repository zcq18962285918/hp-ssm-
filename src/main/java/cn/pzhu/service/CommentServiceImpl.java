package cn.pzhu.service;

import cn.pzhu.base.BaseDao;
import cn.pzhu.base.BaseServiceImpl;
import cn.pzhu.mapper.CommentMapper;
import cn.pzhu.po.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment> implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public BaseDao<Comment> getBaseDao() {
        return commentMapper;
    }

}
