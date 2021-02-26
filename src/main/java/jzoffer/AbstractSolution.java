package jzoffer;

import java.lang.reflect.Proxy;

/**
 * @author scyking
 **/
public abstract class AbstractSolution {

    Solution getProxy(Solution target){
        Solution solutionProxy = (Solution) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new SolutionProxy(target));
        return solutionProxy;
    }

}
