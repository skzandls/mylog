package com.skz.springboot.mylog.service.impl;

import com.skz.springboot.mylog.entity.Friend;
import com.skz.springboot.mylog.mapper.FriendMapper;
import com.skz.springboot.mylog.service.IFriendService;
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
public class FriendServiceImpl extends ServiceImpl<FriendMapper, Friend> implements IFriendService {

}
