package day20_mediator;

/**
 * @author zhuxu
 * @date 2020/6/21 11:56
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();

        mediator.register(colleague1);
        mediator.register(colleague2);

        colleague1.send();
        colleague2.send();

        // 新增Colleague
        Colleague colleague3 = new ConcreteColleague3();
        mediator.register(colleague3);
        colleague3.send();
    }
}
