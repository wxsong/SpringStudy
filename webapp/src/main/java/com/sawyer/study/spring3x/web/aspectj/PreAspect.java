package com.sawyer.study.spring3x.web.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * «∞÷√«–√Ê
 * @author wxsong2
 */
@Aspect
public class PreAspect {

    /**
     * before action
     */
    @Before("execution(**.hasMatchUser())")
    public void beforeAction(){
        System.out.println("before action");
    }
}
