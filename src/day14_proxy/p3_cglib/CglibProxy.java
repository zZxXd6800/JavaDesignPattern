package day14_proxy.p3_cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author zhuxu
 * @date 2020/7/16 9:45
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    public Object getCglibProxyInstance() {
        // 1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(target.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 调用目标对象的方法，类似method.invoke(target, args);
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("CglibProxy: before method invoke ...");
        System.out.println(method.getName() + "::" + Arrays.toString(args));
        Object res = method.invoke(target, args);
        System.out.println("CglibProxy: after method invoke result = " + res);
        return res;
    }
}
