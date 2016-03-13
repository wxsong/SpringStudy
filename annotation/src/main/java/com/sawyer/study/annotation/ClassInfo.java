package com.sawyer.study.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类信息自定义注解
 * @author wxsong2
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ClassInfo {

    /**
     * 类名
     * @return 类名
     */
    public String value() default "类默认名";
}
