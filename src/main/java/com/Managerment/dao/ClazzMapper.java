package com.Managerment.dao;

import com.Managerment.pojo.Clazz;
import com.Managerment.pojo.Grade;

import java.util.List;

public interface ClazzMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);

    List<Clazz> getClazzList();

    List<Clazz> findClazzByPage(int offset);

    int findCount();

    Clazz getClazzById(int parseInt);

    int updateClazz(Clazz clazz);

    void addClazz(Clazz clazz);
}