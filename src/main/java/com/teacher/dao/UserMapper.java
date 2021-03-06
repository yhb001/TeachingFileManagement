package com.teacher.dao;

import com.teacher.entity.User;

import java.util.List;

public interface UserMapper {
    /**
     * 增加普通用户
     * @param user
     * @return int
     */
    int addNormalUser(User user);

    /**
     * 增加管理员
     * @param user
     * @return int
     */
    int addSysAdmin(User user);
    /**
     * 删除用户
     * @param id
     * @return int
     */
    int delete(Long id);
    /**
     * 更新用户密码
     * @param user
     * @return int
     */
    int updatePassword(User user);
    /**
     * 根据id查询用户
     * @param id
     * @return User
     */
    User findById(Long id);

    /**
     * 根据账号查询用户
     * @param username
     * @return User
     */
    User findByUsername(String username);
}
