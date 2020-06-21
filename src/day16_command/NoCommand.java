package day16_command;

/**
 * 空命令，初始化每个按钮，用于简化操作，可以省去对空的判断
 * 如果没有空命令对RemoteController进行初始化，每按下一个按钮都需要判断Command[]数组中是否为空
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("empty command...");
    }

    @Override
    public void undo() {
        System.out.println("empty command...");
    }
}
