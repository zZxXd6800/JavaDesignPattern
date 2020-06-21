package day16_command.light;

/**
 * 命令接受者Receiver
 */
public class LightReceiver {
    public void on() {
        System.out.println("light on...");
    }

    public void off() {
        System.out.println("light off...");
    }
}
