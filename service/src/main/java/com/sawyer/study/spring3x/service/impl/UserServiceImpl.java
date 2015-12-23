package com.sawyer.study.spring3x.service.impl;

import com.sawyer.study.spring3x.dao.UserDao;
import com.sawyer.study.spring3x.domain.User;
import com.sawyer.study.spring3x.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * userService impl
 * @author wxsong2
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * userDao
     */
    @Resource
    private UserDao userDao;

    @Override
    public boolean hasMatchUser(String userName, String password) {
        int matchCount = userDao.getMatchCount(userName, password);
        return matchCount > 0;
    }

    @Override
    public User findUserById(String userId) {
        return userDao.findUserById(userId);
    }

    @Override
    public void updateUserInfo(User user) {
        userDao.updateLoginInfo(user);
    }
}
