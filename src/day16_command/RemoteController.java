package day16_command;

/**
 * 命令调用者Invoker
 */
public class RemoteController {
    private Command[] on;
    private Command[] off;
    private Command undo;

    public RemoteController() {
        on = new Command[5];
        off = new Command[5];
        for (int i = 0; i < 5; i++) {
            on[i] = new NoCommand();
            off[i] = new NoCommand();
        }
    }

    public void setCommand(int n, Command onCommand, Command offCommand) {
        on[n] = onCommand;
        off[n] = offCommand;
    }

    public void onButtonPushed(int n) {
        on[n].execute();
        undo = on[n];
    }

    public void offButtonPushed(int n) {
        off[n].execute();
        undo = off[n];
    }

    public void undoButtonPushed() {
        undo.undo();
    }
}
