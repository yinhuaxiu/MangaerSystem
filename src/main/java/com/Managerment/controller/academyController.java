package com.Managerment.controller;

import com.Managerment.pojo.Academy;
import com.Managerment.pojo.PageBean;
import com.Managerment.pojo.Student;
import com.Managerment.service.academyService;
import com.Managerment.service.pagebeanService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("aca")
public class academyController {
    @Autowired
    private academyService academyService;
    private Logger logger = Logger.getLogger(academyController.class);
    @Autowired
    private pagebeanService pagebeanService;

    /**
     * 展示所有学院信息
     * @param model 输出模型
     * @return
     */
    @RequestMapping("/academy_Page")
    public String dispatcherToAcademyPage(Model model, String currentPage) throws SQLException {

        logger.info("分页逻辑开始");
        PageBean<Academy> pageBean = pagebeanService.findAcademyByPage(Integer.parseInt(currentPage));
        logger.info("当前页面:"+pageBean.getCurrentPage());
        logger.info("分页总页数:"+pageBean.getTotalPage());
        logger.info("分页逻辑结束");
        model.addAttribute("pageBean",pageBean);
        return "Academy";
    }

    /**
     * 删除一条学院信息
     * @param model 输出模型
     * @param academyid 前端学院id
     * @return
     */
    @RequestMapping("/delteByOne")
    public String deleteByOneAcademy(Model model,String academyid) throws SQLException {

        logger.info("删除未开始");
        academyService.deleteOneAcademy(academyid);
        logger.info("删除成功");
        return dispatcherToAcademyPage(model,"1");

    }

    /**
     * 将更新内容输出到更新列表页
     * @param model
     * @param academyid
     * @return
     */
    @RequestMapping("/updateByOne")
    public String updateByOneAcademyId(Model model,String academyid){
        Academy academy = academyService.getAcademyById(academyid);
        model.addAttribute("academy",academy);
        return "update_academy";
    }

    /**
     * 将更新完的结果重新输出
     * @param model
     * @param academy
     * @return
     */
    @RequestMapping("/updateInfoByAcademyId")
    public String updateInfoByAcademyId(Model model,Academy academy) throws SQLException {
        academyService.updateInfoByAcademyId(academy);
        return dispatcherToAcademyPage(model,"1");
    }

    /**
     *新增用户
     * @param model
     * @param academy
     * @return
     */
    @RequestMapping("/addAcademy")
    public String addAcademy(Model model,Academy academy) throws SQLException {
        academyService.addAcademy(academy);
        return dispatcherToAcademyPage(model,"1");
    }

    /**
     * 跳转到添加用户界面
     * @return
     */
    @RequestMapping("/toAddAcademy")
    public String dispatcherToAddAcademyPage(){
        return "add_academy";
    }

}
