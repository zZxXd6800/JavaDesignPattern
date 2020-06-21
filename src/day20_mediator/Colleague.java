package day20_mediator;

/**
 * @author zhuxu
 * @date 2020/6/21 11:51
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();
    public abstract void send();
}
