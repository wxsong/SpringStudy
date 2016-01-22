package com.sawyer.study.spring3x.web.proxy;

/**
 * ��¼���ܼ�����Ϣ
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
     * ���캯�������ܼ��ӵĿ�ʼ
     * @param serviceMethod service method name
     */
    public MethodPerformance(String serviceMethod){
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    /**
     * ���ܼ��ӽ���
     */
    public void printPerformance(){
        end = System.currentTimeMillis();
        long elapse = end - begin;

        System.out.println(serviceMethod + " cost time " + elapse + "ms");
    }
}
