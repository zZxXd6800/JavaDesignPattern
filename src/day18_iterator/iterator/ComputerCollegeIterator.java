package day18_iterator.iterator;

import day18_iterator.aggregate.Department;

import java.util.Iterator;

/**
 * @author zhuxu
 * @date 2020/6/19 19:09
 */
public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Object next() {
        Department department = departments[position++];
        return department;
    }
}
