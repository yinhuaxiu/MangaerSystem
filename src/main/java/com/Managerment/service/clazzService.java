package com.Managerment.service;

import com.Managerment.pojo.Clazz;

import java.util.List;

public interface clazzService {
    /**
     * 获取班级所有记录信息
     * @return
     */
    List<Clazz> getClazzList();

    /**
     * 根据id获取一条记录信息
     * @param classid
     * @return
     */
    Clazz getClazzById(String classid);

    /**
     * 更新一条记录信息
     * @param clazz
     */
    void updateInfoByClazzId(Clazz clazz);

    /**
     * 增加班级
     * @param clazz
     */
    void addClazz(Clazz clazz);

    void deleteOneAcademy(String classid);
}
