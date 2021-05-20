package com.skz.springboot.mylog.service;

import com.skz.springboot.mylog.entity.Type;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author skz
 * @since 2021-05-12
 */
public interface ITypeService extends IService<Type> {
    public  Type getByid(Integer id);

}
