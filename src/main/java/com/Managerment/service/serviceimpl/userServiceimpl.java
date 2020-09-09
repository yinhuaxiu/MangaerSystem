package com.Managerment.service.serviceimpl;

import com.Managerment.dao.UserMapper;
import com.Managerment.pojo.User;
import com.Managerment.service.userService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceimpl implements userService {
    @Autowired
    private UserMapper userMapper;
    private Logger logger = Logger.getLogger(userServiceimpl.class);
    @Override
    public User findUserByName(String username) {
        logger.info("查询未开始！"+username);
        User user = userMapper.selectByName(username);
        logger.info("查询id:"+user.getId());
        logger.info("查询用户:"+user.getUsername());
        logger.info("查询密码:"+user.getPassword());
        if(user != null){
            logger.info("查询结束");
            return user;
        }else{
            logger.info("查询结束111");
            return null;
        }

    }

    @Override
    public void addUserInformation(User user) {
        logger.info("更新开始:"+user.getUsername()+"---"+user.getPassword());
        userMapper.addUserInformation(user);

    }

    @Override
    public void deleteUserById(String userid) {
        userMapper.deleteUserById(Integer.parseInt(userid));
    }

    @Override
    public List<User> getUserList() {
        return userMapper.findAll();
    }

    @Override
    public void updateUserByUserName(User username) {
        userMapper.updateUserByUserName(username);
    }
}
