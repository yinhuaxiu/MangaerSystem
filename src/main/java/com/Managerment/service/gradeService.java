package com.Managerment.service;

import com.Managerment.pojo.Grade;

import java.util.List;

public interface gradeService {
    /**
     * 获取所有年级信息
     * @return
     */
    List<Grade> getGradeList();

    /**
     * 根据id获取年级信息
     * @param gradeid
     * @return
     */
    Grade getGradeById(String gradeid);

    /**
     * 更新年级信息
     * @param grade
     */
    void updateInfoByGradeId(Grade grade);

    /**
     * 只增加用户
     * @param grade
     */
    void addGrade(Grade grade);

    /**
     * 删除用户
     * @param gradeid
     */
    void deleteOneGrade(String gradeid);
}
