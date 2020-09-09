package com.Managerment.service;

import com.Managerment.pojo.Academy;
import com.Managerment.pojo.Course;
import com.Managerment.pojo.Student;
import com.Managerment.pojo.teacher;

import java.util.List;

public interface studentService {
    /**
     * 获取所有学生信息
     * @return
     */
    List<Student> getStudentList();

    /**
     * 增加一名学生
     * @param student
     */
    void addStudent(Student student);

    Student getStudentById(String studentid);

    void updateInfoByStudentId(Student student);

    void deleteOneAcademy(String studentId);

    List<Course> findStudentByName(String stuname);

    List<teacher> findTeacherByName(String teachername);
}
