package com.lagnuage.yz.dao;

import com.lagnuage.yz.entity.hero;
import com.lagnuage.yz.entity.heroExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface heroMapper {
    int countByExample(heroExample example);

    int deleteByExample(heroExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(hero record);

    int insertSelective(hero record);

    List<hero> selectByExample(heroExample example);

    hero selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") hero record, @Param("example") heroExample example);

    int updateByExample(@Param("record") hero record, @Param("example") heroExample example);

    int updateByPrimaryKeySelective(hero record);

    int updateByPrimaryKey(hero record);
}