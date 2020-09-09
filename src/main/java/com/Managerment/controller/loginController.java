package com.Managerment.controller;

import com.Managerment.pojo.User;
import com.Managerment.service.userService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/Login")
public class loginController {
    @Autowired
    private userService userService;
    private Logger logger = Logger.getLogger(loginController.class);

    /**
     * 验证登录
     * @param username 前端用户名
     * @param password 前端密码
     * @param model 输出模型
     * @return
     * @throws IOException
     */
    @RequestMapping("/login")
    public String checkLogin(String username, String password, Model model, HttpSession session) throws IOException {
            logger.info("username:"+username+"---password:"+password);
            User user = userService.findUserByName(username);
            logger.info("User用户名"+user.getUsername()+"前端用户名:"+username);
            logger.info("User密码"+user.getPassword()+"前端密码:"+password);
            if(user.getPassword().equals(password) && user.getUsername().equals(username)){
                session.setAttribute("username",username);
                return "main";

            }
            logger.info("执行完成");
            logger.info("user用户为空");
            model.addAttribute("error_name","用户或密码错误");
            return "login";
    }

    /**
     * 注册用户
     * @param username 前端用户名
     * @param password 前端密码
     * @return
     */
    @RequestMapping("/register")
    public String registerUser(String username,String password){

        logger.info("username:"+username+"---password:"+password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.addUserInformation(user);
        return "login";

    }

    /**
     * 跳转注册页面
     * @return
     */
    @RequestMapping("/register_Page")
    public String dispatcherToRegisterPage(){

        return "register";
    }

    /**
     * 跳转登录界面
     * @return
     */
    @RequestMapping("/login_Page")
    public String dispatcherToLoginPage(){

        return "login";
    }

}
