package day14_proxy.p2_dynamic;

public class Client {
    public static void main(String[] args) {
        System.out.println("Dynamic Proxy: ");
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory2(target).getProxyInstance();
        proxyInstance.teach();

        //在内存中动态生成代理对象：com.sun.proxy.$Proxy0
        System.out.println("proxyInstance = " + proxyInstance.getClass());
    }
}
