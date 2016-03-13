package com.sawyer.study.spring3x.web.proxy;

/**
 * 性能监视的实现类
 * @author wxsong2
 */
public class PerformanceMonitor {

    /**
     * 带线程安全的 性能监控类
     */
    private static ThreadLocal<MethodPerformance> performanceThreadLocal = new ThreadLocal<MethodPerformance>();

    /**
     * 开始监控性能
     * @param methodName 方法名
     */
    public static void begin(String methodName){
        System.out.println("begin monitor");
        MethodPerformance mp = new MethodPerformance(methodName);
        performanceThreadLocal.set(mp);
    }

    /**
     * 结束监视
     */
    public static void end(){
        System.out.println("end monitor");
        MethodPerformance mp = performanceThreadLocal.get();
        mp.printPerformance();
    }
}
