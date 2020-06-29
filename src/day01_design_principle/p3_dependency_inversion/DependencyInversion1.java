package day01_design_principle.p3_dependency_inversion;

/**
 * 方式1比较简单，但如果还需要接受WeChat，Message等信息就需要增加新类，同时Person类也要增加新的接受方法
 * 解决思路：引入一个抽象接口IReceiver表示接受者，让Person类依赖IReceiver接口，Email、WeChat、Message实现IReceiver接口，此时符合依赖倒置原则
 */
public class DependencyInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receiveEmail(new Email());
        person.receiveWeChat(new WeChat());
        person.receiveMessage(new Message());
    }
}

class Email {
    public String getInfo() {
        return "Email Info: Hello, Email.";
    }
}

class WeChat {
    public String getInfo() {
        return "WeChat Info: Hello, WeChat.";
    }
}

class Message {
    public String getInfo() {
        return "Message Info: Hello, Message.";
    }
}

class Person {
    public void receiveEmail(Email email) {
        System.out.println(email.getInfo());
    }

    public void receiveWeChat(WeChat weChat) {
        System.out.println(weChat.getInfo());
    }

    public void receiveMessage(Message message) {
        System.out.println(message.getInfo());
    }
}