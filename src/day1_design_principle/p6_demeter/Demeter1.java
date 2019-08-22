package day1_design_principle.p6_demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * CollegeEmployee以局部变量的形式出现在SchoolManager中，违反了迪米特原则，
 */
public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager1 manager = new SchoolManager1();
        manager.printAllEmployee(new CollegeManager1());
    }
}

/**
 * 学校总部员工
 */
class Employee1 {
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
class SchoolManager1 {
    /**
     * @return 学校所有的员工
     */
    public List<Employee1> getAllEmployee() {
        List<Employee1> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee1 employee = new Employee1();
            employee.setId("学校总部员工id= " + i);
            list.add(employee);
        }
        return list;
    }

    void printAllEmployee(CollegeManager1 manager) {
        List<CollegeEmployee1> list1 = manager.getAllEmployee();
        System.out.println("----------学院员工----------");
        for (CollegeEmployee1 e : list1) {
            System.out.println(e.getId());
        }

        List<Employee1> list2 = this.getAllEmployee();
        System.out.println("----------学校总部员工----------");
        for (Employee1 e : list2) {
            System.out.println(e.getId());
        }
    }
}

/**
 * 学院员工
 */
class CollegeEmployee1 {
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
class CollegeManager1 {
    /**
     * @return 学院所有的员工
     */
    public List<CollegeEmployee1> getAllEmployee() {
        List<CollegeEmployee1> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee1 employee = new CollegeEmployee1();
            employee.setId("学院员工id= " + i);
            list.add(employee);
        }
        return list;
    }
}

