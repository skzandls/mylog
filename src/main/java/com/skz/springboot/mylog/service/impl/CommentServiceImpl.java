package com.skz.springboot.mylog.service.impl;

import com.skz.springboot.mylog.entity.Comment;
import com.skz.springboot.mylog.mapper.CommentMapper;
import com.skz.springboot.mylog.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author skz
 * @since 2021-05-12
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
