package com.Managerment.service.serviceimpl;

import com.Managerment.dao.HealthCardRecordMapper;
import com.Managerment.pojo.HealthCardRecord;
import com.Managerment.service.healthcardrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class healthcardrecordServiceimpl implements healthcardrecordService {
    @Autowired
    private HealthCardRecordMapper healthCardRecordMapper;
    @Override
    public List<HealthCardRecord> getHealthCardRecordList() {
        return healthCardRecordMapper.getHealthCardRecordList();
    }

    @Override
    public HealthCardRecord getHealthById(String  healthCardRecordId) {
        return  healthCardRecordMapper.getHealthById(Integer.parseInt(healthCardRecordId));
    }

    @Override
    public void updateInfoByHealthId(HealthCardRecord healthCardRecord) {
        healthCardRecordMapper.updateHealth(healthCardRecord);
    }

    @Override
    public void addHealth(HealthCardRecord healthCardRecord) {
        healthCardRecordMapper.addHealthCardRecord(healthCardRecord);
    }

    @Override
    public void deleteOneAcademy(String id) {
            healthCardRecordMapper.deleteByPrimaryKey(Integer.parseInt(id));
    }
}
