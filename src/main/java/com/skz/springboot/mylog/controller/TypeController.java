package com.skz.springboot.mylog.controller;


import com.skz.springboot.mylog.entity.Type;
import com.skz.springboot.mylog.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author skz
 * @since 2021-05-12
 */
@RestController
@RequestMapping("/mylog/")
public class TypeController {
    @Autowired
    private ITypeService iTypeService;

    @GetMapping(value = "/type")
//    @RequestParam Integer id
    public Type getByid (@RequestParam Integer id){
//        int id=1;
        System.out.println(id);
        Type byid = iTypeService.getByid(id);
        System.out.println(byid);
        return byid;

    }

}
