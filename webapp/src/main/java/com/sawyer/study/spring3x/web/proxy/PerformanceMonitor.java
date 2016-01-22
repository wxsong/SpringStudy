package com.sawyer.study.spring3x.web.proxy;

/**
 * ���ܼ��ӵ�ʵ����
 * @author wxsong2
 */
public class PerformanceMonitor {

    /**
     * ���̰߳�ȫ�� ���ܼ����
     */
    private static ThreadLocal<MethodPerformance> performanceThreadLocal = new ThreadLocal<MethodPerformance>();

    /**
     * ��ʼ�������
     * @param methodName ������
     */
    public static void begin(String methodName){
        System.out.println("begin monitor");
        MethodPerformance mp = new MethodPerformance(methodName);
        performanceThreadLocal.set(mp);
    }

    /**
     * ��������
     */
    public static void end(){
        System.out.println("end monitor");
        MethodPerformance mp = performanceThreadLocal.get();
        mp.printPerformance();
    }
}
