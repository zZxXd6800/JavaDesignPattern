package day11_composite;

/**
 * 组合模式：又叫部分整体模式(HashMap)
 * 它创建了对象组的树形结构，将对象组合成树形结构以表示“整体--部分”的层次关系，使用户对单个对象和组合对象的访问具有一致性
 * 当我们要处理的对象可以生成一颗树形结构，组合模式可以使我们对分支节点和叶子节点的操作具有一致性
 * 如果分支节点和叶子节点差异性很大的话，比如很多方法和属性都不一样，就不适合使用组合模式
 */
public class Composite {
    public static void main(String[] args) {
        //从大到小创建对象
        University university = new University("XiDian University", "西电");

        College college1 = new College("Communication College", "通信学院");
        College college2 = new College("Computing College", "计算机学院");

        Department department1 = new Department("Communication Engineering", "通信工程");
        Department department2 = new Department("Computer Science", "计算机科学");
        Department department3 = new Department("Software Engineering", "软件工程");

        college1.add(department1);
        college2.add(department2);
        college2.add(department3);

        university.add(college1);
        university.add(college2);

        university.print();
//        college2.print();
//        department1.print();
    }
}
