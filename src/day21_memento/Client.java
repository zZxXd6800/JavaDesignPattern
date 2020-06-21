package day21_memento;

/**
 * @author zhuxu
 * @date 2020/6/21 13:14
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("state 0");
        caretaker.add("s0", originator.saveState());
        originator.setState("state 1");
        caretaker.add("s1", originator.saveState());
        originator.setState("state 2");
        caretaker.add("s2", originator.saveState());

        System.out.println("current state: " + originator.getState());

        System.out.println("return to state 0");
        originator.getStateFromMemento(caretaker.get("s0"));
        System.out.println("current state: " + originator.getState());
    }
}
