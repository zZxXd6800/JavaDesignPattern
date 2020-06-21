package day16_command.light;

import day16_command.Command;

/**
 * 具体命令，实现了Command接口
 */
public class LightOnCommand implements Command {
    private LightReceiver receiver;

    public LightOnCommand(LightReceiver receiver) {
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
