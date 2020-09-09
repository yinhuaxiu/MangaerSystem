package com.Managerment.controller;

import com.Managerment.pojo.PageBean;
import com.Managerment.pojo.QueryVo;
import com.Managerment.pojo.User;
import com.Managerment.service.userService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Controller
@RequestMapping("user")
public class userController {

    @Autowired
    private userService userService;
    private Logger logger = Logger.getLogger(userController.class);
    @Autowired
    private com.Managerment.service.pagebeanService pagebeanService;

    /**
     * 展示所有用户信息
     * @param model 输出模型
     * @return
     */
    @RequestMapping("/user_Page")
    public String dispatcherToUserPage(Model model, String currentPage) throws SQLException {

        logger.info("分页逻辑开始");
        PageBean<User> pageBean = pagebeanService.findUserByPage(Integer.parseInt(currentPage));
        logger.info("当前页面:"+pageBean.getCurrentPage());
        logger.info("分页总页数:"+pageBean.getTotalPage());
        logger.info("分页逻辑结束");
        model.addAttribute("userpageBean",pageBean);
        return "logout";
    }
    /**
     * 注销用户信息
     * @param model 输出模型
     * @param userid 用户id
     * @return
     */
    @RequestMapping("/deleteUserById")
    public String deleteUserById(Model model, String userid,String username,HttpSession session) throws SQLException {

        logger.info("删除未开始");
        logger.info("用户id:"+userid);
        userService.deleteUserById(userid);
        logger.info("删除成功，查询未开始");
        if(username.equals(session.getAttribute("username"))){
            session.removeAttribute("username");
            return "tips";
        }
        return dispatcherToUserPage(model,"1");
    }

    /**
     * 更新用户密码
     * @param session
     * @param newPassword
     * @return
     */
    @RequestMapping("/updateUserByUseName")
    public String updateUserByUseName(HttpSession session, @RequestParam("newPassword") String newPassword){

        logger.info("用户名:"+session.getAttribute("username")+"---密码:"+newPassword);
        logger.info("更新未开始");
        User user = new User();
        user.setUsername((String) session.getAttribute("username"));
        user.setPassword(newPassword);
        userService.updateUserByUserName(user);
        logger.info("更新结束");
        return "login";

    }

    /**
     * 转交到删除页面
     * @param model
     * @return
     * @throws SQLException
     */
    @RequestMapping("deleteUserById_Page")
    public String dispatcherToDeleteUserById(Model model) throws SQLException {
        return dispatcherToUserPage(model,"1");
    }


}
