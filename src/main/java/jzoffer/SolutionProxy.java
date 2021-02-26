package jzoffer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author scyking
 **/
public class SolutionProxy implements InvocationHandler {

    private Solution target;

    public SolutionProxy(Solution target) {
        this.target = target;
    }

    private double nanosToSeconds(long duration) {
        return duration / 1_000_000_000.0;
    }

    private double nanosToMillis(long duration) {
        return duration / 1_000_000.0;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.nanoTime();
        Object result = method.invoke(target, args);
        long duration = System.nanoTime() - start;
        System.out.printf("方法名：%s \n", method.getName());
        System.out.printf("方法执行结果：%s \n", result);
        System.out.printf("方法执行时间：%s ms \n", nanosToMillis(duration));
        return result;
    }
}
