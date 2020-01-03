package com.github.publisherfk.aop.ch549;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author by fukun
 */
public class ProfilingDemo {
    public static void main(String args[]) {
        WorkerBean workerBean = getWorkerBean();
        workerBean.doSomeWork(10000000);
    }

    private static WorkerBean getWorkerBean() {
        WorkerBean target = new WorkerBean();
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(new ProfilingInterceptor());

        return (WorkerBean) factory.getProxy();
    }
}
