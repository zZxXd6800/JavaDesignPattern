package day20_mediator;

/**
 * @author zhuxu
 * @date 2020/6/21 11:55
 */
public class ConcreteColleague3 extends Colleague {
    @Override
    public void receive() {
        System.out.println("concrete colleague 3 receive request...");
    }

    @Override
    public void send() {
        System.out.println("concrete colleague 3 send request...");
        mediator.relay(this);
    }
}
