package com.sawyer.study.spring3x.dao.impl;

import com.sawyer.study.spring3x.dao.UserDao;
import com.sawyer.study.spring3x.domain.User;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * ”√ªßdao test
 * @author wxsong2
 */
@ContextConfiguration(locations = "classpath:config/applicationContext_*.xml")
public class UserDaoImplTest extends AbstractJUnit4SpringContextTests {

    /**
     * userDao
     */
    @Resource
    private UserDao userDao;

    /**
     * test getMatchCount
     */
    @Test
    public void getMatchCountTest(){
        int c = userDao.getMatchCount("aaa", "aaa");
        System.out.print(c);
    }

    /**
     * test findUserById
     */
    @Test
    public void testFindUserById(){
        User user = userDao.findUserById("123");
        if(user != null){
            System.out.println(user.getUserName());
        }
    }

    /**
     * test updateUserInfo
     */
    @Test
    public void testUpdateUserInfo(){
        User user = new User();
        user.setUserId("123");
        user.setAge(7);
        userDao.updateLoginInfo(user);
    }
}
