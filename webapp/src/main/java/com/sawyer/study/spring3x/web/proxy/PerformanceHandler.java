package com.sawyer.study.spring3x.web.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 */
public class PerformanceHandler implements InvocationHandler {

    /**
     * target object
     */
    private Object target;

    /**
     * construct
     * @param target target
     */
    public PerformanceHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName() + "." + method.getName());
        Object o = method.invoke(target, args);
        PerformanceMonitor.end();
        return o;
    }
}
