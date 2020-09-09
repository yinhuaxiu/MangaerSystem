package com.Managerment.service;

import com.Managerment.pojo.*;

import java.sql.SQLException;

public interface pagebeanService <T>{

    /**
     * 根据页码查询学生集合的业务
     * @param currentPage
     * @return
     */
    PageBean findStudentByPage(int currentPage) throws SQLException;
    /**
     * 根据页码查询学院集合的业务
     * @param currentPage
     * @return
     */
    PageBean findAcademyByPage(int currentPage) ;
    /**
     * 根据页码查询班级集合的业务
     * @param currentPage
     * @return
     */
    PageBean findClazzByPage(int currentPage);
    /**
     * 根据页码查询年级集合的业务
     * @param currentPage
     * @return
     */
    PageBean findGradeByPage(int currentPage);
    /**
     * 根据页码查询医疗记录集合的业务
     * @param currentPage
     * @return
     */
    PageBean findHealthCardRecordByPage(int currentPage);
    /**
     * 根据页码查询用户集合的业务
     * @param currentPage
     * @return
     */
    PageBean findUserByPage(int currentPage);

//    PageBean<Course> findStuByPage(int parseInt,String name);
//
//    PageBean<teacher> findTeaBypage(int parseInt, String stuname);
}
