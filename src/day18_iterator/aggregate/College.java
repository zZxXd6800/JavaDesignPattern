package day18_iterator.aggregate;

import java.util.Iterator;

/**
 * @author zhuxu
 * @date 2020/6/19 19:10
 */
public interface College {
    String getName();
    void addDepartment(String name, String des);
    Iterator createIterator();
}
