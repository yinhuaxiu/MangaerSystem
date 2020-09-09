package com.Managerment.service;

import com.Managerment.pojo.HealthCardRecord;

import java.util.List;

public interface healthcardrecordService {
    /**
     * 获取所有医疗记录信息
     * @return
     */
    List<HealthCardRecord> getHealthCardRecordList();

    /**
     * 根据id返回对应的记录信息
     * @param healthCardRecord
     * @return
     */
    HealthCardRecord getHealthById(String healthCardRecord);

    /**
     * 更新医疗记录信息
     * @param healthCardRecord
     */
    void updateInfoByHealthId(HealthCardRecord healthCardRecord);

    /**
     * 添加医疗卡信息
     * @param healthCardRecord
     */
    void addHealth(HealthCardRecord healthCardRecord);

    /**
     * 删除信息
     * @param id
     */
    void deleteOneAcademy(String id);
}
