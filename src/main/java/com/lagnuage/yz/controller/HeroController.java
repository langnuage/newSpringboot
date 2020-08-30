package com.lagnuage.yz.controller;

import com.lagnuage.yz.service.HeroService;
import com.lagnuage.yz.utils.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.TimeUnit;

@Controller
@ResponseBody
public class HeroController {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private HeroService heroService;

    private static final Logger log = LoggerFactory.getLogger(HeroController.class);

    @RequestMapping("/hero/{id}")
    public String getHeroById(@PathVariable(value = "id") String id) {
        boolean haskey = redisUtils.exists(id);
        String str = "";
        if (haskey) {
            //获取缓存
            Object object = redisUtils.get(id);
            log.info("从缓存获取的数据" + object);
            str = object.toString();
        } else {
            //从数据库中获取信息
            log.info("从数据库中获取数据");
            str = heroService.getById(Integer.valueOf(id)).toString();
            //数据插入缓存（set中的参数含义：key值，user对象，缓存存在时间10（long类型），时间单位）
            redisUtils.set(id, str, 10L, TimeUnit.MINUTES);
            log.info("数据插入缓存" + str);
        }
        return str;
    }

}
