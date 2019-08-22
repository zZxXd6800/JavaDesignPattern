package day1_design_principle.p6_demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 将打印学院员工信息的方法封装到CollegeManager中即可
 */
public class Demeter2 {
    public static void main(String[] args) {
        SchoolManager2 manager = new SchoolManager2();
        manager.printAllEmployee(new CollegeManager2());
    }
}

/**
 * 学校总部员工
 */
class Employee2 {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 学校员工的管理类
 *
 */
class SchoolManager2 {
    /**
     * @return 学校所有的员工
     */
    public List<Employee2> getAllEmployee() {
        List<Employee2> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee2 employee = new Employee2();
            employee.setId("学校总部员工id= " + i);
            list.add(employee);
        }
        return list;
    }

    void printAllEmployee(CollegeManager2 manager) {
        manager.printEmployee();

        List<Employee2> list = this.getAllEmployee();
        System.out.println("----------学校总部员工----------");
        for (Employee2 e : list) {
            System.out.println(e.getId());
        }
    }
}

/**
 * 学院员工
 */
class CollegeEmployee2 {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 学院员工的管理类
 */
class CollegeManager2 {
    /**
     * @return 学院所有的员工
     */
    public List<CollegeEmployee2> getAllEmployee() {
        List<CollegeEmployee2> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee2 employee = new CollegeEmployee2();
            employee.setId("学院员工id= " + i);
            list.add(employee);
        }
        return list;
    }

    public void printEmployee() {
        List<CollegeEmployee2> list = this.getAllEmployee();
        System.out.println("----------学院员工----------");
        for (CollegeEmployee2 e : list) {
            System.out.println(e.getId());
        }
    }
}