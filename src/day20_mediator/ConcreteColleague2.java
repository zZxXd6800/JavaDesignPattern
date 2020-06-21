package day20_mediator;

/**
 * @author zhuxu
 * @date 2020/6/21 11:55
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("concrete colleague 2 receive request...");
    }

    @Override
    public void send() {
        System.out.println("concrete colleague 2 send request...");
        mediator.relay(this);
    }
}
