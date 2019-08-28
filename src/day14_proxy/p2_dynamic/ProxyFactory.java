package day14_proxy.p2_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        /*
        1.ClassLoader loader：指定当前目标对象使用的类加载器，获取类加载器的方法固定
        2.Class<?>[] interfaces：目标对象实现的接口类型，使用泛型的方式确认类型
        3.InvocationHandler h：事件处理，执行目标对象的方法时会触发事件处理器方法，把当前执行的目标对象方法作为一个参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk proxy begin...");
                Object returnVal = method.invoke(target, args);
                System.out.println("jdk proxy submit...");
                return returnVal;
            }
        });
    }
}
