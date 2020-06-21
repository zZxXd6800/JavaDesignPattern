package day21_memento;

import java.util.HashMap;
import java.util.Map;

/**
 * 管理者：保存和管理多个备忘录对象
 */
public class Caretaker {
    private Map<String, Memento> mementos = new HashMap<>();

    public void add(String des, Memento memento) {
        mementos.put(des, memento);
    }

    public Memento get(String des) {
        return mementos.get(des);
    }
}
