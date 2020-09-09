package com.Managerment.dao;

import com.Managerment.pojo.FailCourse;

public interface FailCourseMapper {
    int deleteByPrimaryKey(Integer failCourseId);

    int insert(FailCourse record);

    int insertSelective(FailCourse record);

    FailCourse selectByPrimaryKey(Integer failCourseId);

    int updateByPrimaryKeySelective(FailCourse record);

    int updateByPrimaryKey(FailCourse record);
}