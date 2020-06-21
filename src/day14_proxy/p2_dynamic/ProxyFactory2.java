package day14_proxy.p2_dynamic;

import java.lang.reflect.Proxy;

/**
 * @author zhuxu
 * @date 2020/6/19 11:05
 */
public class ProxyFactory2 {
    private ITeacherDao target;

    public ProxyFactory2(ITeacherDao target) {
        this.target = target;
    }

    public ITeacherDao getProxyInstance() {
        return (ITeacherDao) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("jdk proxy begin...");
            Object returnVal = method.invoke(target, args);
            System.out.println("jdk proxy submit...");
            return returnVal;
        });
    }
}
