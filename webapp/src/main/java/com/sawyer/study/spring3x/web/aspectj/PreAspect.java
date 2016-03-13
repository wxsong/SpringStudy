package com.sawyer.study.spring3x.web.aspectj;

import com.sawyer.study.annotation.MethodInfo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

/**
 * 前置增强
 * @author wxsong2
 */
@Aspect
@Component
public class PreAspect {

    /**
     * before action
     */
    @Before("within(com.sawyer.study.spring3x.web.controller..*) && @annotation(methodInfo)")
    public void beforeAction(JoinPoint joinPoint, MethodInfo methodInfo){
        if(methodInfo != null){
            System.out.println(methodInfo.value());
        }
    }
}
