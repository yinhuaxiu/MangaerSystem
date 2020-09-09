package com.Managerment.service;

import com.Managerment.pojo.Academy;

import java.util.List;

public interface academyService {
    /**
     * 获取所有学院信息
     * @return
     */
    List<Academy> getAcademyList();

    /**
     * 根据id删除一条记录信息
     * @param academy
     */
    void deleteOneAcademy(String academy);

    /**
     * 获取一条记录信息
     * @param academyid
     * @return
     */
    Academy getAcademyById(String academyid);

    /**
     * 更新一条记录信息
     * @param academy
     */
    void updateInfoByAcademyId(Academy academy);

    /**
     * 添加一条记录信息
     * @param academy
     */
    void addAcademy(Academy academy);
}
