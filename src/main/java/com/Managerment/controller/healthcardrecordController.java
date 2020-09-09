package com.Managerment.controller;

import com.Managerment.pojo.Academy;
import com.Managerment.pojo.Grade;
import com.Managerment.pojo.HealthCardRecord;
import com.Managerment.pojo.PageBean;
import com.Managerment.service.healthcardrecordService;
import com.Managerment.service.pagebeanService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/health")
public class healthcardrecordController {
    @Autowired
    private healthcardrecordService healthcardrecordService;
    private Logger logger = Logger.getLogger(healthcardrecordController.class);
    @Autowired
    private com.Managerment.service.pagebeanService pagebeanService;
    /**
     * 展示所有学院信息
     * @param model 输出模型
     * @return
     */
    @RequestMapping("/healthcardrecord_Page")
    public String dispatcherToHealthCardRecordPage(Model model, String currentPage) throws SQLException {

        logger.info("分页查询开始");
        PageBean<HealthCardRecord> pageBean = pagebeanService.findHealthCardRecordByPage(Integer.parseInt(currentPage));
        logger.info("当前页面:"+pageBean.getCurrentPage());
        logger.info("分页总页数:"+pageBean.getTotalPage());
        model.addAttribute("healthpageBean",pageBean);
        logger.info("分页查询结束");
        return "health_card_record";
    }

    /**
     * 提交到更新页面并输出
     * @param model
     * @param healthCardRecordId
     * @return
     */
    @RequestMapping("/updateByOne")
    public String updateByOneHealthId(Model model,String  healthCardRecordId){
        HealthCardRecord healthCardRecord = healthcardrecordService.getHealthById(healthCardRecordId);
        model.addAttribute("healthCardRecord",healthCardRecord);
        return "update_health_record";
    }

    /**
     * 更新并刷新列表
     * @param model
     * @param healthCardRecord
     * @return
     * @throws SQLException
     */
    @RequestMapping("/updateInfoByHealthId")
    public String updateInfoByGraded( HealthCardRecord healthCardRecord,Model model) throws SQLException {
        logger.info("医疗号:"+healthCardRecord.getRemarkNum());
        logger.info("看诊时间:"+healthCardRecord.getStime());
        healthcardrecordService.updateInfoByHealthId(healthCardRecord);
        return dispatcherToHealthCardRecordPage(model,"1");
    }

    /**
     * 跳转到增加页面
     * @return
     */
    @RequestMapping("/toHealyCardRecord")
    public String toAddHealyCardRecord(){
        return "add_health_record";
    }

    /**
     * 新增用户
     * @param model
     * @param healthCardRecord
     * @return
     */
    @RequestMapping("/addHealyCardRecord")
    public String addHealyCardRecord(Model model, HealthCardRecord healthCardRecord) throws SQLException, ParseException {

        healthcardrecordService.addHealth(healthCardRecord);
        return dispatcherToHealthCardRecordPage(model,"1");
    }
    /**
     * 删除一条学院信息
     * @param model 输出模型
     * @param id 前端医疗卡id
     * @return
     */
    @RequestMapping("/delteByOne")
    public String deleteByOneAcademy(Model model,String id) throws SQLException {

        logger.info("删除未开始");
        healthcardrecordService.deleteOneAcademy(id);
        logger.info("删除成功");
        return dispatcherToHealthCardRecordPage(model,"1");

    }
}
