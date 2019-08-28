package day14_proxy.p2_dynamic;

public class Client {
    public static void main(String[] args) {
        System.out.println("Dynamic Proxy: ");
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();

        //class com.sun.proxy.$Proxy0
        System.out.println("proxyInstance = " + proxyInstance.getClass());
    }
}
