package com.Managerment.controller;


import com.Managerment.pojo.Student;
import com.Managerment.service.academyService;
import com.Managerment.service.studentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    private Logger logger = Logger.getLogger(MainController.class);
    @Autowired
    private studentService studentService;
    @Autowired
    private academyService academyService;

    /**
     * 跳转到主界面
     * @return
     */
    @RequestMapping("/main_Page")
    public String dispatcherToMainPage(){
        return "main";
    }

    /**
     * 跳转到欢迎界面
     * @return
     */
    @RequestMapping("/First_Page")
    public String dispatcherToFirstPage(){
        return "welcome";
    }

    /**
     * 跳转到年级界面
     * @return
     */
    @RequestMapping("/grade_Page")
    public String dispatcherToGradePage(){
        return "Grade";
    }

    /**
     * 跳转到班级界面
     * @return
     */
    @RequestMapping("/clazz_Page")
    public String dispatcherToClazzPage(){
        return "Class";
    }

    /**
     * 跳转修改密码界面
     * @return
     */
    @RequestMapping("/update_Page")
    public String dispatcherToUpdatePage(){
        return "updateUser";
    }

    /**
     * 跳转注册页面
     * @return
     */
    @RequestMapping("/register_Page")
    public String dispatcherToRegisterPage(){
        return "register";
    }

    @RequestMapping("inforSearch")
    public String dispatcherToInforSearch(){
        return "search";
    }
}
