package day18_iterator;

import day18_iterator.aggregate.College;
import day18_iterator.aggregate.Department;

import java.util.Iterator;
import java.util.List;

/**
 * @author zhuxu
 * @date 2020/6/19 19:32
 */
public class OutPut {
    private List<College> list;

    public OutPut(List<College> list) {
        this.list = list;
    }

    public void print() {
        Iterator<College> iterator = list.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("|---" + college.getName());
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator itr) {
        while (itr.hasNext()) {
            Department department = (Department) itr.next();
            System.out.println("\t|---" + department.getName());
        }
    }
}
