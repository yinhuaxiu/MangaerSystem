package com.Managerment.dao;

import com.Managerment.pojo.Academy;
import com.Managerment.pojo.Grade;

import java.util.List;

public interface AcademyMapper {
    int deleteByPrimaryKey(Integer academyId);

    int insert(Academy record);

    int insertSelective(Academy record);

    Academy selectByPrimaryKey(Integer academyId);

    int updateByPrimaryKeySelective(Academy record);

    int updateByPrimaryKey(Academy record);

    List<Academy> getAcademyList();

    int findCount();

    List<Academy> findAcademyByPage(int offset);

    List<Grade> findGradeByPage(int offset);

    Academy getAcademyById(Integer academyid);

    int updateAcademy(Academy academy);

    int addAcademy(Academy academy);
}