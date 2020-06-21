package day16_command;

import day16_command.light.LightOffCommand;
import day16_command.light.LightOnCommand;
import day16_command.light.LightReceiver;
import day16_command.tv.TVOffCommand;
import day16_command.tv.TVOnCommand;
import day16_command.tv.TVReceiver;

/**
 * 命令模式：将"动作的请求者"和"动作的执行者"进行解耦，命令对象起到了桥梁的作用。支持对命令的撤销操作
 * 可能会导致某些系统里面出现太多的具体命令，增加的系统的复杂度
 */
public class Client {
    public static void main(String[] args) {
        //命令接受者
        LightReceiver receiver = new LightReceiver();
        //具体命令和执行该命令的接受者进行绑定
        LightOnCommand on = new LightOnCommand(receiver);
        LightOffCommand off = new LightOffCommand(receiver);

        //命令调用者
        RemoteController controller = new RemoteController();
        controller.setCommand(0, on, off);

        System.out.println("-----light command-----");
        controller.onButtonPushed(0);
        controller.offButtonPushed(0);
        controller.undoButtonPushed();

        //增加对电视按钮的控制，符合开闭原则
        TVReceiver receiver1 = new TVReceiver();
        TVOnCommand on1 = new TVOnCommand(receiver1);
        TVOffCommand off1 = new TVOffCommand(receiver1);
        controller.setCommand(1, on1, off1);

        System.out.println("-----tv command-----");
        controller.onButtonPushed(1);
        controller.offButtonPushed(1);
        controller.undoButtonPushed();
    }
}
