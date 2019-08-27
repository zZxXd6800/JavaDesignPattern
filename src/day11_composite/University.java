package day11_composite;

import java.util.ArrayList;
import java.util.List;

public class University extends Component {

    private List<Component> colleges = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(Component component) {
        colleges.add(component);
    }

    @Override
    protected void remove(Component component) {
        colleges.remove(component);
    }

    /**
     * 输出University中包含的College
     */
    @Override
    protected void print() {
        System.out.println("----------" + getName() + "----------");
        //遍历colleges
        for (Component college : colleges) {
            college.print();
        }
    }
}
