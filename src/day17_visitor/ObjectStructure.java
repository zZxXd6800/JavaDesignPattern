package day17_visitor;

import day17_visitor.element.Person;
import day17_visitor.visitor.Action;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhuxu
 * @date 2020/6/19 16:54
 */
public class ObjectStructure {
    private List<Person> people = new LinkedList<>();

    public void attach(Person person) {
        people.add(person);
    }

    public void detach(Person person) {
        people.remove(person);
    }

    public void display(Action action) {
        for (Person p : people) {
            p.accept(action);
        }
    }
}
