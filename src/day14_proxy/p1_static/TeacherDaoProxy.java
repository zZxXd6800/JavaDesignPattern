package day14_proxy.p1_static;

/**
 * 静态代理对象，聚合了一个目标对象
 */
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        //额外增加的功能
        System.out.println("proxy begin...");

        //目标对象的功能
        target.teach();

        //额外增加的功能
        System.out.println("proxy submit...");
    }
}
