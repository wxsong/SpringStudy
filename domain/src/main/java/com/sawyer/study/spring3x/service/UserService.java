package com.sawyer.study.spring3x.service;

import com.sawyer.study.spring3x.domain.User;

/**
 * user service
 * @author wxsong2
 */
public interface UserService {

    /**
     * �ж��Ƿ��з����������û�
     * @param userName �û���
     * @param password ����
     * @return �Ƿ����
     */
    boolean hasMatchUser(String userName, String password);

    /**
     * ����Id��ȡ�û�����
     * @param userId �û�Id
     * @return �û�����
     */
    User findUserById(String userId);

    /**
     * �����û���Ϣ
     * @param user user
     */
    void updateUserInfo(User user);
}
