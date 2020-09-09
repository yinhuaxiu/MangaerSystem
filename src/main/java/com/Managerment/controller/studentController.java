package com.Managerment.controller;

import com.Managerment.pojo.*;
import com.Managerment.service.pagebeanService;
import com.Managerment.service.studentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/stu")
public class studentController {
    @Autowired
    private studentService studentService;
    private Logger logger = Logger.getLogger(studentController.class);
    @Autowired
    private com.Managerment.service.pagebeanService pagebeanService;
    /**
     * 展示所有学生信息
     * @param model 输出模型
     * @return
     */
    @RequestMapping("/student_Page")
    public String dispatcherToStudentPage(Model model,String currentPage) throws SQLException {

        logger.info("分页查询开始");
        PageBean<Student> pageBean = pagebeanService.findStudentByPage(Integer.parseInt(currentPage));
        logger.info("当前页面:"+pageBean.getCurrentPage());
        logger.info("分页总页数:"+pageBean.getTotalPage());
        model.addAttribute("stupageBean",pageBean);
        logger.info("分页查询结束");
        return "Student";
    }
    @RequestMapping("/addStudent")
    public String addStudent(Model model, Student student, @RequestParam("picture") MultipartFile picture) throws SQLException, IOException {

        logger.info("更新操作开始:");
        logger.info("新增学生姓名为:"+student.getStudentName());
        String picture_name = picture.getOriginalFilename();
        logger.info(picture_name);
        String newFileName = UUID.randomUUID().toString()+picture_name.substring(picture_name.lastIndexOf("."));
        File upload = new File("E:/uploads/"+newFileName);
        picture.transferTo(upload);
        student.setPhoto(newFileName);
        studentService.addStudent(student);
        return dispatcherToStudentPage(model,"1");
    }
    /**
     * 将更新内容输出到更新列表页
     * @param model
     * @param studentId
     * @return
     */
    @RequestMapping("/updateByOne")
    public String updateByOneStudentId(Model model,String studentId){
        Student student = studentService.getStudentById(studentId);
        model.addAttribute("student",student);
        return "update_student";
    }

    /**
     * 将更新完的结果重新输出
     * @param model
     * @param student
     * @return
     */
    @RequestMapping("/updateInfoByStudentd")
    public String updateInfoByStudentId(Model model,Student student,@RequestParam("picture") MultipartFile picture) throws SQLException, IOException {
        String picture_name = picture.getOriginalFilename();
        logger.info(picture_name);
        String newFileName = UUID.randomUUID().toString()+picture_name.substring(picture_name.lastIndexOf("."));
        File upload = new File("E:/uploads/"+newFileName);
        picture.transferTo(upload);
        student.setPhoto(newFileName);
        studentService.updateInfoByStudentId(student);
        return dispatcherToStudentPage(model,"1");
    }
    /**
     * 删除一条学生信息
     * @param model 输出模型
     * @param studentId 前端学院id
     * @return
     */
    @RequestMapping("/delteByOne")
    public String deleteByOneStudent(Model model,String studentId) throws SQLException {

        logger.info("删除未开始");
        studentService.deleteOneAcademy(studentId);
        logger.info("删除成功");
        return dispatcherToStudentPage(model,"1");

    }

    /**
     * 转交到新增页面
     * @return
     */
    @RequestMapping("/addStudent_Page")
    public String dispatcherToAddstudentPage(){
        return "add_student";
    }

    @RequestMapping("deleteall")
    public String delAll(QueryVo vo,Model model) throws SQLException {

        for(Integer id:vo.getIds()){
            logger.info("一条记录删除未开始");
            studentService.deleteOneAcademy(String.valueOf(id));
            logger.info("一条记录删除成功");
        }
        return dispatcherToStudentPage(model,"1");

    }
    @RequestMapping("serchByStuName")
    public String serchByStuName(Model model,HttpServletRequest request,String currentPage){

        logger.info("前端stu文本框内容:"+request.getParameter("stuname"));
        List<Course> courses = studentService.findStudentByName(request.getParameter("stuname"));
//        logger.info("分页查询开始");
//        PageBean<Course> pageBean = pagebeanService.findStuByPage(Integer.parseInt(currentPage),request.getParameter("stuname"));
//        logger.info("当前页面:"+pageBean.getCurrentPage());
//        logger.info("分页总页数:"+pageBean.getTotalPage());
//        model.addAttribute("spageBean",pageBean);
//        logger.info("分页查询结束");
        model.addAttribute("course",courses);
        for (Course t:courses){
            logger.info(t);
        }
        return "stu_search";

    }
    @RequestMapping("serchByTeaName")
    public String serchByTeaName(Model model, HttpServletRequest request,String currentPage){
        logger.info("前端stu文本框内容:"+request.getParameter("teachername"));
        List<teacher> courses = studentService.findTeacherByName((String)request.getParameter("teachername"));
//        logger.info("分页查询开始");
//        PageBean<teacher> pageBean = pagebeanService.findTeaBypage(Integer.parseInt(currentPage),request.getParameter("stuname"));
//        logger.info("当前页面:"+pageBean.getCurrentPage());
//        logger.info("分页总页数:"+pageBean.getTotalPage());
//        model.addAttribute("TpageBean",pageBean);
        logger.info("分页查询结束");
        model.addAttribute("course",courses);
        for (teacher t:courses){
            logger.info(t);
        }

        return "tea_search";

    }
}
