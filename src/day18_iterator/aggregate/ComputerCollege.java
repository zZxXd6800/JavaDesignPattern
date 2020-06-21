package day18_iterator.aggregate;

import day18_iterator.iterator.ComputerCollegeIterator;

import java.util.Iterator;

/**
 * @author zhuxu
 * @date 2020/6/19 19:10
 */
public class ComputerCollege implements College {
    private Department[] departments;
    private int index = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("computer science", "cs");
        addDepartment("computer technology", "ct");
        addDepartment("software engineering", "se");
    }

    @Override
    public String getName() {
        return "computer college";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department = new Department(name, des);
        departments[index++] = department;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
