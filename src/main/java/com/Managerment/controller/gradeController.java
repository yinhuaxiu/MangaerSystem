package com.Managerment.controller;

import com.Managerment.pojo.Grade;
import com.Managerment.pojo.PageBean;
import com.Managerment.pojo.QueryVo;
import com.Managerment.service.gradeService;
import com.Managerment.service.pagebeanService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/grade")
public class gradeController {

    @Autowired
    private gradeService gradeService;
    private Logger logger = Logger.getLogger(gradeController.class);
    @Autowired
    private pagebeanService pagebeanService;
    /**
     * 展示所有年级信息
     * @param model 输出模型
     * @return
     */
    @RequestMapping("/grade_Page")
    public String dispatcherToGradePage(Model model, String currentPage) throws SQLException {

        logger.info("分页查询开始");
        PageBean<Grade> pageBean = pagebeanService.findGradeByPage(Integer.parseInt(currentPage));
        logger.info("当前页面:"+pageBean.getCurrentPage());
        logger.info("分页总页数:"+pageBean.getTotalPage());
        model.addAttribute("grapageBean",pageBean);
        logger.info("分页查询结束");
        return "Grade";
    }

    /**
     * 转交给更新页面并展示
     * @param model
     * @param gradeid
     * @return
     */
    @RequestMapping("/updateByOne")
    public String updateByOneGradeId(Model model,String gradeid){
        Grade grade = gradeService.getGradeById(gradeid);
        model.addAttribute("grade",grade);
        return "update_grade";
    }

    /**
     * 更新页面并刷新
     * @param model
     * @param grade
     * @return
     * @throws SQLException
     */
    @RequestMapping("/updateInfoByGradeId")
    public String updateInfoByGraded(Model model,Grade grade) throws SQLException {
        gradeService.updateInfoByGradeId(grade);
        return dispatcherToGradePage(model,"1");
    }

    /**
     * 跳转到增加页面
     * @return
     */
    @RequestMapping("/toAddGrade")
    public String toAddGrade(){
        return "add_grade";
    }

    /**
     * 新增用户
     * @param model
     * @param grade
     * @return
     */
    @RequestMapping("/addGrade")
    public String addGrade(Model model,Grade grade) throws SQLException {
        gradeService.addGrade(grade);
        return dispatcherToGradePage(model,"1");
    }

    /**
     * 删除用户
     * @param model
     * @param gradeid
     * @return
     */
    @RequestMapping("/deleteByone")
    public String deleteByOneAcademy(Model model,String gradeid) throws SQLException {

        logger.info("删除未开始");
        gradeService.deleteOneGrade(gradeid);
        return dispatcherToGradePage(model,"1");
    }
    @RequestMapping("updateAll")
    public String updateAll(QueryVo vo,Model model) throws SQLException {
        for(Grade grade:vo.getGradeList()){
            logger.info("一条记录更新开始");
            gradeService.updateInfoByGradeId(grade);
            logger.info("一条记录更新结束");
        }
        return dispatcherToGradePage(model,"1");
    }

    @RequestMapping(value = "ReceiveJson", produces = "application/json;charset=UTF-8")
    @ResponseBody
    @GetMapping("list") //组合注解，
    public List<Grade> receiveJson(){

        JSONArray array =new JSONArray();
        List<Grade> gradeList=gradeService.getGradeList();
        for(Grade g:gradeList){
            String gradeName =g.getGradeName();
            Double employmengtRate=g.getEmploymengtRate();
            JSONObject obj=new JSONObject();
            //前台通过key值获得对应的value值
            obj.put("gradeName", gradeName);
            obj.put("employmengtRate", employmengtRate);
            array.add(obj);
        }
        logger.info(array.toString());
        return gradeList;

    }

}
