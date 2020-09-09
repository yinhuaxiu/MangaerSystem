package com.Managerment.dao;

import com.Managerment.pojo.HealthCardRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HealthCardRecordMapper {
    List<HealthCardRecord> getHealthCardRecordList();

    List<HealthCardRecord> findhealthcardrecordByPage(int offset);

    int findCount();

    int updateHealth(HealthCardRecord healthCardRecord);

    HealthCardRecord getHealthById(Integer healthCardRecordId);

    void addHealthCardRecord(HealthCardRecord healthCardRecord);

    void deleteByPrimaryKey(int parseInt);
}
