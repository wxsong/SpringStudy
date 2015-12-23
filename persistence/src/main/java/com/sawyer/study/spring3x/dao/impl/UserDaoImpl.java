package com.sawyer.study.spring3x.dao.impl;

import com.sawyer.study.spring3x.dao.UserDao;
import com.sawyer.study.spring3x.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * user dao impl
 *
 * @author wxsong2
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    /**
     * userJdbcTemplate
     */
    @Autowired
    private JdbcTemplate userJdbcTemplate;

    /**
     * userNamedParameterJdbcTemplate
     */
    @Autowired
    private NamedParameterJdbcTemplate userNamedParameterJdbcTemplate;

    @Override
    public int getMatchCount(String userName, String password) {
        Assert.notNull(userName, "userName is required!");
        Assert.notNull(password, "password is required!");
        String sqlStr = "select count(*) from user where userName=? and password=?";
        //return userJdbcTemplate.queryForInt(sqlStr, new Object[]{userName, password});
        return userJdbcTemplate.queryForObject(sqlStr, new Object[]{userName, password}, Integer.class);
    }

    @Override
    public User findUserById(String userId) {
        Assert.notNull(userId, "userId is required!");
        String sqlStr = "select userId, userName, password, age, last_visit, last_ip from user where userId=:userId";
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        return userNamedParameterJdbcTemplate.queryForObject(sqlStr, params, new UserMapper());
    }

    @Override
    public void updateLoginInfo(User user) {
        Assert.notNull(user, "user is required!");
        String sqlStr = "UPDATE user set age = ? where userId = ?";
        userJdbcTemplate.update(sqlStr, new Object[]{user.getAge(), user.getUserId()});
    }

    /**
     * userMapper
     */
    private class UserMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setUserId(resultSet.getString("userId"));
            user.setUserName(resultSet.getString("userName"));
            user.setPassword(resultSet.getString("password"));
            user.setAge(resultSet.getInt("age"));
            user.setLastVisit(resultSet.getDate("last_visit"));
            user.setLastIp(resultSet.getString("last_ip"));
            return user;
        }
    }
}
