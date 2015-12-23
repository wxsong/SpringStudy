package com.sawyer.study.spring3x.dao;

import com.sawyer.study.spring3x.domain.User;

/**
 * user dao
 * @author wxsong2
 */
public interface UserDao {

    /**
     * ����û�������
     * @param userName userName
     * @param password password
     * @return count
     */
    int getMatchCount(String userName, String password);

    /**
     * ����userId��ѯuser
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
