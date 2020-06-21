package day16_command.light;

import day16_command.Command;

/**
 * 具体命令，实现了Command接口
 */
public class LightOffCommand implements Command {
    private LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
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
