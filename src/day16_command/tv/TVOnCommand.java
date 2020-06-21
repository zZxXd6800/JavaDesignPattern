package day16_command.tv;

import day16_command.Command;

/**
 * @author zhuxu
 * @date 2020/6/19 14:55
 */
public class TVOnCommand implements Command {
    private TVReceiver receiver;

    public TVOnCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
