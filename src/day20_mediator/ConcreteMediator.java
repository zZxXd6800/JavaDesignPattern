package day20_mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuxu
 * @date 2020/6/21 11:52
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : colleagues) {
            if (!c.equals(colleague)) {
                c.receive();
            }
        }
    }
}
