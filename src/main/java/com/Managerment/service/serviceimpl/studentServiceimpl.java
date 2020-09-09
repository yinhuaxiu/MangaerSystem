package com.Managerment.service.serviceimpl;

import com.Managerment.dao.StudentMapper;
import com.Managerment.pojo.Academy;
import com.Managerment.pojo.Course;
import com.Managerment.pojo.Student;
import com.Managerment.pojo.teacher;
import com.Managerment.service.studentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceimpl implements studentService {

    @Autowired
    private StudentMapper studentMapper;
    private Logger logger = Logger.getLogger(studentServiceimpl.class);

    @Override
    public List<Student> getStudentList() {
        return studentMapper.getStudentList();
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public Student getStudentById(String studentid) {
        return studentMapper.getStudentById(Integer.parseInt(studentid));
    }

    @Override
    public void updateInfoByStudentId(Student student) {
        studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public void deleteOneAcademy(String studentId) {
        studentMapper.deleteByPrimaryKey(Integer.parseInt(studentId));
    }

    @Override
    public List<Course> findStudentByName(String stuname) {
        return studentMapper.findStudentByName(stuname);
    }

    @Override
    public List<teacher> findTeacherByName(String teachername) {
        return studentMapper.findTeacherByName(teachername);
    }
}
