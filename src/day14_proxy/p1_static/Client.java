package day14_proxy.p1_static;

public class Client {
    public static void main(String[] args) {
        System.out.println("Static Proxy: ");
        //1.创建目标对象
        TeacherDao teacher = new TeacherDao();
        //2.创建代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacher);
        //3.通过代理对象调用目标对象的方法
        proxy.teach();
    }
}
