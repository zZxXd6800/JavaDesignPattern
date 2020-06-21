package day16_command.tv;

import day16_command.Command;

/**
 * @author zhuxu
 * @date 2020/6/19 14:56
 */
public class TVOffCommand implements Command {
    private TVReceiver receiver;

    public TVOffCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
