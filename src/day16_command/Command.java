package day16_command;

/**
 * 命令角色(抽象类/接口)
 */
public interface Command {
    void execute();
    void undo();
}
