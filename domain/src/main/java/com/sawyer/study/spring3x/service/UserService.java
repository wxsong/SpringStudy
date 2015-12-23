package com.sawyer.study.spring3x.service;

import com.sawyer.study.spring3x.domain.User;

/**
 * user service
 * @author wxsong2
 */
public interface UserService {

    /**
     * 判断是否有符合条件的用户
     * @param userName 用户名
     * @param password 密码
     * @return 是否符合
     */
    boolean hasMatchUser(String userName, String password);

    /**
     * 根据Id获取用户对象
     * @param userId 用户Id
     * @return 用户对象
     */
    User findUserById(String userId);

    /**
     * 更新用户信息
     * @param user user
     */
    void updateUserInfo(User user);
}
