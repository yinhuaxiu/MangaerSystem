package com.Managerment.dao;

import com.Managerment.pojo.Grade;

import java.util.List;

public interface GradeMapper {
    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> getGradeList();

    int findCount();

    List<Grade> findGradeByPage(int offset);

    Grade getGradeById(Integer gradeid);

    int updateGrade(Grade grade);

    int addGrade(Grade grade);

    int deleteByPrimaryKey(Integer gradeid);

}