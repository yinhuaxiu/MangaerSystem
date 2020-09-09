package com.Managerment.service.serviceimpl;

import com.Managerment.dao.GradeMapper;
import com.Managerment.pojo.Grade;
import com.Managerment.service.gradeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gradeServiceimpl implements gradeService {
    @Autowired
    private GradeMapper gradeMapper;
    private Logger logger = Logger.getLogger(gradeServiceimpl.class);

    @Override
    public List<Grade> getGradeList() {
        return gradeMapper.getGradeList();
    }

    @Override
    public Grade getGradeById(String gradeid) {
        return gradeMapper.getGradeById(Integer.parseInt(gradeid));
    }

    @Override
    public void updateInfoByGradeId(Grade grade) {
        gradeMapper.updateGrade(grade);
    }

    @Override
    public void addGrade(Grade grade){gradeMapper.addGrade(grade);}

    @Override
    public void deleteOneGrade(String gradeid){gradeMapper.deleteByPrimaryKey(Integer.parseInt(gradeid));}
}
