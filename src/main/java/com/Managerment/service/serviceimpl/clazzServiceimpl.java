package com.Managerment.service.serviceimpl;

import com.Managerment.dao.ClazzMapper;
import com.Managerment.pojo.Clazz;
import com.Managerment.service.clazzService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class clazzServiceimpl implements clazzService {

    @Autowired
    private ClazzMapper clazzMapper;
    private Logger logger = Logger.getLogger(clazzServiceimpl.class);

    @Override
    public List<Clazz> getClazzList() {
        return clazzMapper.getClazzList();
    }

    @Override
    public Clazz getClazzById(String classid) {
        return clazzMapper.getClazzById(Integer.parseInt(classid));
    }

    @Override
    public void updateInfoByClazzId(Clazz clazz) {
        clazzMapper.updateClazz(clazz);
    }

    @Override
    public void addClazz(Clazz clazz){clazzMapper.addClazz(clazz);}

    @Override
    public void deleteOneAcademy(String classid) {
        clazzMapper.deleteByPrimaryKey(Integer.parseInt(classid));
    }


}
