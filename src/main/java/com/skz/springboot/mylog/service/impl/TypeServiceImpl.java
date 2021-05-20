package com.skz.springboot.mylog.service.impl;

import com.skz.springboot.mylog.entity.Type;
import com.skz.springboot.mylog.mapper.TypeMapper;
import com.skz.springboot.mylog.service.ITypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {
    @Override
    public Type getByid(Integer id) {
       return getBaseMapper().selectById(id);
    }
}
