package com.Managerment.service;

import com.Managerment.pojo.User;

import java.util.List;

public interface userService {
    /**
     * 按照姓名查找用户
     * @param username
     * @return
     */
    User findUserByName(String username);

    /**
     * 增加用户信息
     * @param user
     */
    void addUserInformation(User user);

    /**
     * 删除用户
     * @param userid
     */
    void deleteUserById(String userid);

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getUserList();

    /**
     * 更新用户密码
     * @param username
     */
    void updateUserByUserName(User username);
}
