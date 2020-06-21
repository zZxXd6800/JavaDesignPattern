package day18_iterator;

import day18_iterator.aggregate.College;
import day18_iterator.aggregate.CommunicationCollege;
import day18_iterator.aggregate.ComputerCollege;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器：提供一个遍历集合元素的统一接口，用一致的方法遍历集合元素，不需要知道集合对象的底层实现，不暴露其内部的结构
 * 符合单一职责原则，将管理对象集合和遍历对象集合的责任分开；每个聚合对象都需要一个迭代器，会产生很多个迭代器类不好管理
 * 源码：List(抽象聚合类), ArrayList(具体聚合类), Iterator(抽象迭代器), Itr(具体迭代器)
 */
public class Client {
    public static void main(String[] args) {
        List<College> list = new ArrayList<>();
        list.add(new CommunicationCollege());
        list.add(new ComputerCollege());

        OutPut outPut = new OutPut(list);
        outPut.print();
    }
}
