package com.Managerment.dao;

import com.Managerment.pojo.BreakRule;

public interface BreakRuleMapper {
    int deleteByPrimaryKey(Integer breakRuleId);

    int insert(BreakRule record);

    int insertSelective(BreakRule record);

    BreakRule selectByPrimaryKey(Integer breakRuleId);

    int updateByPrimaryKeySelective(BreakRule record);

    int updateByPrimaryKey(BreakRule record);
}