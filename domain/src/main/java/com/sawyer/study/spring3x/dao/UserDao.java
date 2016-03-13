package com.sawyer.study.spring3x.dao;

import com.sawyer.study.spring3x.domain.User;

/**
 * user dao
 * @author wxsong2
 */
public interface UserDao {

    /**
     * 监测用户名密码
     * @param userName userName
     * @param password password
     * @return count
     */
    int getMatchCount(String userName, String password);

    /**
     * 根据userId查询user
     * @param userId userId
     * @return user
     */
    User findUserById(String userId);

    /**
     * update user
     * @param user user
     */
    void updateLoginInfo(User user);
}
