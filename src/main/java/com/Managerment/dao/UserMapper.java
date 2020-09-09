package com.Managerment.dao;

import com.Managerment.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    /**
     * 查询用户信息
     * @param username
     * @return
     */
    User selectByName(String username);

    /**
     * 增加用户信息
     * @param user
     */
    void addUserInformation(User user);

    /**
     * 删除用户信息
     * @param userid
     */
    void deleteUserById(Integer userid);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();

    /**
     * 更新用户信息
     * @param username
     */
    void updateUserByUserName(User username);

    /**
     * 按页表查询用户信息
     * @param offset
     * @return
     */
    List<User> findUserByPage(int offset);

    /**
     * 查询总记录条数
     * @return
     */
    int findCount();
}