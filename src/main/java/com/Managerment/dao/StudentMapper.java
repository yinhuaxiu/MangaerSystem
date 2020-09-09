package com.Managerment.dao;

import com.Managerment.pojo.Academy;
import com.Managerment.pojo.Course;
import com.Managerment.pojo.Student;
import com.Managerment.pojo.teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);

    /**
     * 获得所有学生信息
     * @return
     */
    List<Student> getStudentList();

    /**
     * 按页面查找学生信息
     * @param currentPage
     * @return
     */
    List<Student> findStudentByPage(int currentPage);

    /**
     * 获得总记录条数
     * @return
     */
    int findCount();

    /**
     * 查询指定一条信息并返回
     * @param parseInt
     * @return
     */
    Student getStudentById(int parseInt);

    /**
     * 更新学生信息
     * @param student
     */
    void updateByPrimaryKey(Student student);

    void deleteByPrimaryKey(Integer studentis);

    @Select("select DISTINCT s.course_name,s.student_num,s.student_name,s.course_score,c.class_name\n"+
            "from score s,choose_course c\n"+
            "where s.student_num=c.student_num and s.student_name=#{student_name};")
    List<Course> findStudentByName(String student_name);

    @Select("select count(b.course_name) as 'chooseNum',c.course_id,c.course_name,c.course_teacher\n" +
            "from course c ,choose_course b\n" +
            "WHERE c.course_id = b.course_id  and c.course_teacher=#{course_teacher}\n" +
            "group by c.course_name;")
    List<teacher> findTeacherByName(String course_teacher);
    @Select("select count(DISTINCT s.course_name)\n" +
            "from score s,choose_course c\n" +
            "where s.student_num=c.student_num and s.student_name=#{name}")
    int findCountS(String name);
    @Select("select count(DISTINCT b.course_name)\n" +
            "from course c ,choose_course b\n" +
            "WHERE c.course_id = b.course_id  and c.course_teacher=#{name}")
    int findCountT(String name);
}