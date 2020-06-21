package day11_composite;

/**
 * 专业 (叶子节点Leaf)
 */
public class Department extends Component {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("\t\t|---" + getName());
    }
}
