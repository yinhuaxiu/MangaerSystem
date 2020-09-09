package com.Managerment.service.serviceimpl;

import com.Managerment.dao.*;
import com.Managerment.pojo.*;
import com.Managerment.service.pagebeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class pagebeanServiceimpl implements pagebeanService {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private AcademyMapper academyMapper;
    @Autowired
    private GradeMapper gradeMapper;
    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private HealthCardRecordMapper healthCardRecordMapper;
    @Autowired
    private UserMapper userMapper;
    private final Integer PAGE_SIZE = 5;
    @Override
    public PageBean findStudentByPage(int currentPage) throws SQLException {
        PageBean<Student> pageBean= new PageBean<Student>();
        //设置了pageBean每页显示多少
        pageBean.setPageSize(PAGE_SIZE);
        int offset=(currentPage-1)*PAGE_SIZE;
        List<Student> studentList=studentMapper.findStudentByPage(offset);
        //设置了pagebean当前页学生集合
        pageBean.setList(studentList);
        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //总页数和总记录数
        //获取总记录数
        int count=studentMapper.findCount();
        //设置总记录数
        pageBean.setTotalSize(count);
        int totalPage=count % PAGE_SIZE==0 ? count/PAGE_SIZE : (count/PAGE_SIZE)+1;
        //设置总页数
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }

    @Override
    public PageBean findAcademyByPage(int currentPage) {
        PageBean<Academy> pageBean= new PageBean<Academy>();
        //设置了pageBean每页显示多少
        pageBean.setPageSize(PAGE_SIZE);
        int offset=(currentPage-1)*PAGE_SIZE;
        List<Academy> academyList=academyMapper.findAcademyByPage(offset);
        //设置了pagebean当前页学生集合
        pageBean.setList(academyList);
        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //总页数和总记录数
        //获取总记录数
        int count=academyMapper.findCount();
        //设置总记录数
        pageBean.setTotalSize(count);
        int totalPage=count % PAGE_SIZE==0 ? count/PAGE_SIZE : (count/PAGE_SIZE)+1;
        //设置总页数
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }

    @Override
    public PageBean findClazzByPage(int currentPage) {
        PageBean<Clazz> pageBean= new PageBean<Clazz>();
        //设置了pageBean每页显示多少
        pageBean.setPageSize(PAGE_SIZE);
        int offset=(currentPage-1)*PAGE_SIZE;
        List<Clazz> clazzList=clazzMapper.findClazzByPage(offset);
        //设置了pagebean当前页学生集合
        pageBean.setList(clazzList);
        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //总页数和总记录数
        //获取总记录数
        int count=clazzMapper.findCount();
        //设置总记录数
        pageBean.setTotalSize(count);
        int totalPage=count % PAGE_SIZE==0 ? count/PAGE_SIZE : (count/PAGE_SIZE)+1;
        //设置总页数
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }

    @Override
    public PageBean findGradeByPage(int currentPage) {
        PageBean<Grade> pageBean= new PageBean<Grade>();
        //设置了pageBean每页显示多少
        pageBean.setPageSize(PAGE_SIZE);
        int offset=(currentPage-1)*PAGE_SIZE;
        List<Grade> gradeList=gradeMapper.findGradeByPage(offset);
        //设置了pagebean当前页学生集合
        pageBean.setList(gradeList);
        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //总页数和总记录数
        //获取总记录数
        int count=gradeMapper.findCount();
        //设置总记录数
        pageBean.setTotalSize(count);
        int totalPage=count % PAGE_SIZE==0 ? count/PAGE_SIZE : (count/PAGE_SIZE)+1;
        //设置总页数
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }

    @Override
    public PageBean findHealthCardRecordByPage(int currentPage) {
        PageBean<HealthCardRecord> pageBean= new PageBean<HealthCardRecord>();
        //设置了pageBean每页显示多少
        pageBean.setPageSize(PAGE_SIZE);
        int offset=(currentPage-1)*PAGE_SIZE;
        List<HealthCardRecord> healthcardrecordList=healthCardRecordMapper.findhealthcardrecordByPage(offset);
        //设置了pagebean当前页学生集合
        pageBean.setList(healthcardrecordList);
        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //总页数和总记录数
        //获取总记录数
        int count=healthCardRecordMapper.findCount();
        //设置总记录数
        pageBean.setTotalSize(count);
        int totalPage=count % PAGE_SIZE==0 ? count/PAGE_SIZE : (count/PAGE_SIZE)+1;
        //设置总页数
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }

    @Override
    public PageBean findUserByPage(int currentPage) {
        PageBean<User> pageBean= new PageBean<User>();
        //设置了pageBean每页显示多少
        pageBean.setPageSize(PAGE_SIZE);
        int offset=(currentPage-1)*PAGE_SIZE;
        List<User> healthcardrecordList=userMapper.findUserByPage(offset);
        //设置了pagebean当前页学生集合
        pageBean.setList(healthcardrecordList);
        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //总页数和总记录数
        //获取总记录数
        int count=userMapper.findCount();
        //设置总记录数
        pageBean.setTotalSize(count);
        int totalPage=count % PAGE_SIZE==0 ? count/PAGE_SIZE : (count/PAGE_SIZE)+1;
        //设置总页数
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }

//    @Override
//    public PageBean<Course> findStuByPage(int currentPage,String name) {
//        PageBean<Course> pageBean= new PageBean<Course>();
//        //设置了pageBean每页显示多少
//        pageBean.setPageSize(PAGE_SIZE);
//        int offset=(currentPage)*PAGE_SIZE;
//        List<Course> healthcardrecordList=studentMapper.findStudentByName(name,offset);
//        //设置了pagebean当前页学生集合
//        pageBean.setList(healthcardrecordList);
//        //设置当前页
//        pageBean.setCurrentPage(currentPage);
//        //总页数和总记录数
//        //获取总记录数
//        int count=studentMapper.findCountS(name);
//        //设置总记录数
//        pageBean.setTotalSize(count);
//        int totalPage=count % PAGE_SIZE==0 ? count/PAGE_SIZE : (count/PAGE_SIZE)+1;
//        //设置总页数
//        pageBean.setTotalPage(totalPage);
//        return pageBean;
//    }
//
//    @Override
//    public PageBean<teacher> findTeaBypage(int parseInt, String stuname) {
//        PageBean<teacher> pageBean= new PageBean<teacher>();
//        //设置了pageBean每页显示多少
//        pageBean.setPageSize(PAGE_SIZE);
//        int offset=(parseInt)*PAGE_SIZE;
//        List<teacher> healthcardrecordList=studentMapper.findTeacherByName(stuname,offset);
//        //设置了pagebean当前页学生集合
//        pageBean.setList(healthcardrecordList);
//        //设置当前页
//        pageBean.setCurrentPage(parseInt);
//        //总页数和总记录数
//        //获取总记录数
//        int count=studentMapper.findCountT(stuname);
//        //设置总记录数
//        pageBean.setTotalSize(count);
//        int totalPage=count % PAGE_SIZE==0 ? count/PAGE_SIZE : (count/PAGE_SIZE)+1;
//        //设置总页数
//        pageBean.setTotalPage(totalPage);
//        return pageBean;
//    }


}
