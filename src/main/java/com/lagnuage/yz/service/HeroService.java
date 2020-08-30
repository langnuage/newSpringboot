package com.lagnuage.yz.service;

import com.lagnuage.yz.dao.heroMapper;
import com.lagnuage.yz.entity.hero;
import com.lagnuage.yz.entity.heroExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HeroService {

    @Autowired
    private heroMapper heroMapper;

    public List<hero> getAllHero() {
        heroExample heroExample = new heroExample();
        heroExample.createCriteria();
        return heroMapper.selectByExample(heroExample);
    }

    public hero getById(int id) {
        return heroMapper.selectByPrimaryKey(id);
    }


}
