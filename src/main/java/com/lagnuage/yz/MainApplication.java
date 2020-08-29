package com.lagnuage.yz;


import com.lagnuage.yz.entity.hero;
import com.lagnuage.yz.service.HeroService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@SpringBootApplication
@MapperScan("com.lagnuage.yz.dao")
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =  SpringApplication.run(MainApplication.class, args);
        HeroService heroService = ctx.getBean(HeroService.class);
        List<hero> list = heroService.getAllHero();
        for (hero hero : list) {
            System.out.println(hero);
        }

    }
}
