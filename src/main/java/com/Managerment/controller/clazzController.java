package com.Managerment.controller;


import com.Managerment.pojo.Clazz;

import com.Managerment.pojo.PageBean;
import com.Managerment.service.clazzService;
import com.Managerment.service.pagebeanService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/clazz")
public class clazzController {
    @Autowired
    private clazzService clazzService;
    @Autowired
    private pagebeanService pagebeanService;
    private Logger logger = Logger.getLogger(clazzController.class);
    /**
     * 展示所有学院信息
     * @param model 输出模型
     * @return
     */
    @RequestMapping("/clazz_Page")
    public String dispatcherToClazzPage(Model model, String currentPage) throws SQLException {

        logger.info("分页查询开始");
        PageBean<Clazz> pageBean = pagebeanService.findClazzByPage(Integer.parseInt(currentPage));
        logger.info("当前页面:"+pageBean.getCurrentPage());
        logger.info("分页总页数:"+pageBean.getTotalPage());
        logger.info("总记录条数:"+pageBean.getTotalSize());
        model.addAttribute("clazpageBean",pageBean);
        logger.info("分页查询结束");
        return "Class";
    }

    /**
     * 转到更新层并展示数据
     * @param model
     * @param classid
     * @return
     */
    @RequestMapping("/updateByOne")
    public String updateByOneClazzId(Model model,String classid){
        Clazz clazz = clazzService.getClazzById(classid);
        model.addAttribute("clazz",clazz);
        return "update_class";
    }

    /**
     * 更新并提交到展示页面
     * @param model
     * @param clazz
     * @return
     * @throws SQLException
     */
    @RequestMapping("/updateInfoByClazzId")
    public String updateInfoByClazzId(Model model,Clazz clazz) throws SQLException {
        clazzService.updateInfoByClazzId(clazz);
        return dispatcherToClazzPage(model,"1");
    }

    /**
     * 跳转到增加页面
     * @return
     */
    @RequestMapping("/toAddClazz")
    public String toAddClazz(){
        return "add_class";
    }

    /**
     * 插入数据
     * @param model
     * @param clazz
     * @return
     */
    @RequestMapping("/addClazz")
    public String addClazz(Model model, Clazz clazz) throws SQLException {
        clazzService.addClazz(clazz);
        return dispatcherToClazzPage(model,"1");
    }
    /**
     * 删除一条班级信息信息
     * @param model 输出模型
     * @param classid 前端班级id
     * @return
     */
    @RequestMapping("/delteByOne")
    public String deleteByOneClazz(Model model,String classid) throws SQLException {

        logger.info("删除未开始");
        clazzService.deleteOneAcademy(classid);
        logger.info("删除成功");
        return dispatcherToClazzPage(model,"1");

    }
}
