package com.sawyer.study.spring3x.domain;

import java.util.Date;

/**
 * user 对象
 * @author wxsong2
 */
public class User {

    /**
     * 用户id
     */
    private String userId;

    /**
     * userName
     */
    private String userName;

    /**
     * password
     */
    private String password;

    /**
     * age
     */
    private int age;

    /**
     * lastVisit
     */
    private Date lastVisit;

    /**
     * lastIp
     */
    private String lastIp;

    /**
     * get userId
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set userId
     * @param userId userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * get userName
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set userName
     * @param userName userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * get password
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * set password
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * set age
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * get lastVisit
     * @return lastVisit
     */
    public Date getLastVisit() {
        return lastVisit;
    }

    /**
     * set lastVisit
     * @param lastVisit lastVisit
     */
    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    /**
     * get lastIp
     * @return lastIp
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * set lastIp
     * @param lastIp lastIp
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }
}
