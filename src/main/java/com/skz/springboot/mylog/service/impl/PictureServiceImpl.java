package com.skz.springboot.mylog.service.impl;

import com.skz.springboot.mylog.entity.Picture;
import com.skz.springboot.mylog.mapper.PictureMapper;
import com.skz.springboot.mylog.service.IPictureService;
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
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture> implements IPictureService {

}
