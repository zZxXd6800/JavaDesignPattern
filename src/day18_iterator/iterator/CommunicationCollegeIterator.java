package day18_iterator.iterator;

import day18_iterator.aggregate.Department;

import java.util.Iterator;
import java.util.List;

/**
 * @author zhuxu
 * @date 2020/6/19 19:09
 */
public class CommunicationCollegeIterator implements Iterator {
    private List<Department> departments;
    private int position = -1;

    public CommunicationCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.size()-1){
            return false;
        } else {
            position++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(position);
    }
}
