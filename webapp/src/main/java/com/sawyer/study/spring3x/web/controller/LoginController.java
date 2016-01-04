package com.sawyer.study.spring3x.web.controller;

import com.sawyer.study.spring3x.domain.User;
import com.sawyer.study.spring3x.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * login controller
 * @author wxsong2
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    /**
     * user service
     */
    @Resource
    private UserService userService;

    /**
     * get index page
     * @return index page
     */
    @RequestMapping("/index")
    public String index(){
        return "login/main/index";
    }

    /**
     * get user info
     * @param model model
     * @param userName userName
     * @param password password
     * @return userInfoPage
     */
    @RequestMapping("/getUserInfo")
    public String getUserInfo(ModelMap model, String userName, String password){
        boolean isExist = userService.hasMatchUser(userName, password);
        model.put("isUserExist", isExist);
        if(isExist){
            User user = userService.findUserById("1");
            model.put("user", user);
        }
        return "home";
    }
}
