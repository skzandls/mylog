package com.skz.springboot.mylog.service.impl;

import com.skz.springboot.mylog.entity.Blog;
import com.skz.springboot.mylog.mapper.BlogMapper;
import com.skz.springboot.mylog.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author skz
 * @since 2021-05-12
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
