package day14_proxy.p3_cglib;

public class Client {
    public static void main(String[] args) {
        System.out.println("Dynamic Proxy: ");
        TeacherDao target = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new CglibProxy(target).getCglibProxyInstance();
        proxyInstance.add(1,1);
        proxyInstance.update("cglib");

        //在内存中动态生成代理对象：day14_proxy.p3_cglib.TeacherDao$$EnhancerByCGLIB$$51e8c6c5
        System.out.println("proxyInstance = " + proxyInstance.getClass());
    }
}
