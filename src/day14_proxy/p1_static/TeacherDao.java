package day14_proxy.p1_static;

/**
 * 目标对象
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("teacher is teaching...");
    }
}
