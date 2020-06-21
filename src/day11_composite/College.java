package day11_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院 (非叶节点Composite)
 */
public class College extends Component {

    private List<Component> departments = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(Component component) {
        departments.add(component);
    }

    @Override
    protected void remove(Component component) {
        departments.remove(component);
    }

    /**
     * 输出University中包含的College
     */
    @Override
    protected void print() {
        System.out.println("\t|---" + getName());
        //遍历colleges
        for (Component department : departments) {
            department.print();
        }
    }
}
