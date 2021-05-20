package com.skz.springboot.mylog.service.impl;

import com.skz.springboot.mylog.entity.Message;
import com.skz.springboot.mylog.mapper.MessageMapper;
import com.skz.springboot.mylog.service.IMessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
