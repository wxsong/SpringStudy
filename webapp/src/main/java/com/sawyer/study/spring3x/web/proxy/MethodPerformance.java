package com.sawyer.study.spring3x.web.proxy;

/**
 * 记录性能监视信息
 * @author wxsong2
 */
public class MethodPerformance {

    /**
     * start time
     */
    private long begin;

    /**
     * end time
     */
    private long end;

    /**
     * service method name
     */
    private String serviceMethod;

    /**
     * 构造函数，性能监视的开始
     * @param serviceMethod service method name
     */
    public MethodPerformance(String serviceMethod){
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    /**
     * 性能监视结束
     */
    public void printPerformance(){
        end = System.currentTimeMillis();
        long elapse = end - begin;

        System.out.println(serviceMethod + " cost time " + elapse + "ms");
    }
}
