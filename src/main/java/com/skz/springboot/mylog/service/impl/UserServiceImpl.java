package com.skz.springboot.mylog.service.impl;

import com.skz.springboot.mylog.entity.User;
import com.skz.springboot.mylog.mapper.UserMapper;
import com.skz.springboot.mylog.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
