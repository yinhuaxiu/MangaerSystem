package com.Managerment.service.serviceimpl;

import com.Managerment.dao.AcademyMapper;
import com.Managerment.pojo.Academy;
import com.Managerment.service.academyService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class academyServiceimpl implements academyService {
    @Autowired
    private AcademyMapper academyMapper;
    private Logger logger = Logger.getLogger(academyServiceimpl.class);

    @Override
    public List<Academy> getAcademyList() {
        return academyMapper.getAcademyList();
    }

    @Override
    public void deleteOneAcademy(String academy) {
        academyMapper.deleteByPrimaryKey(Integer.parseInt(academy));
    }

    @Override
    public Academy getAcademyById(String academyid) {
        return academyMapper.getAcademyById(Integer.parseInt(academyid));
    }

    @Override
    public void updateInfoByAcademyId(Academy academy) {
        academyMapper.updateAcademy(academy);
    }

    @Override
    public void addAcademy(Academy academy) {
        academyMapper.addAcademy(academy);
    }
}
