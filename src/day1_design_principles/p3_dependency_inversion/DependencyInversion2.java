package day1_design_principles.p3_dependency_inversion;

/**
 * 引入一个抽象接口IReceiver表示接受者，让Person类依赖IReceiver接口，Email、WeChat、Message实现IReceiver接口，此时符合依赖倒置原则
 * a.低层模块尽量都要有抽象类或接口，程序稳定性会更好
 * b.变量的声明类型尽量为抽象类或接口，这样变量引用和实际对象间就存在一个缓冲层，利于程序扩展和优化
 * c.继承时应遵循里氏替换原则
 */
public class DependencyInversion2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.receive(new Email2());
        person.receive(new WeChat2());
        person.receive(new Message2());
    }
}

interface IReceiver {
    String getInfo();
}

class Email2 implements IReceiver {
    @Override
    public String getInfo() {
        return "Email Info: Hello, Email.";
    }
}

class WeChat2 implements IReceiver {
    @Override
    public String getInfo() {
        return "WeChat Info: Hello, WeChat.";
    }
}

class Message2 implements IReceiver {
    @Override
    public String getInfo() {
        return "Message Info: Hello, Message.";
    }
}

class Person2 {
    /**
     * @param receiver 对接口进行依赖
     */
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}