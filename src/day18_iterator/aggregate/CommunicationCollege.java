package day18_iterator.aggregate;

import day18_iterator.iterator.CommunicationCollegeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhuxu
 * @date 2020/6/19 19:10
 */
public class CommunicationCollege implements College {
    private List<Department> departments;
    private int index = 0;

    public CommunicationCollege() {
        departments = new ArrayList<>(5);
        addDepartment("information security", "is");
        addDepartment("network security", "cs");
    }

    @Override
    public String getName() {
        return "communication college";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department = new Department(name, des);
        departments.add(department);
        index++;
    }

    @Override
    public Iterator createIterator() {
        return new CommunicationCollegeIterator(departments);
    }
}
