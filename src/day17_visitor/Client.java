package day17_visitor;

import day17_visitor.element.Man;
import day17_visitor.element.Woman;
import day17_visitor.visitor.Action;
import day17_visitor.visitor.Fail;
import day17_visitor.visitor.Success;
import day17_visitor.visitor.Wait;

/**
 * @author zhuxu
 * @date 2020/6/19 16:55
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man("Jack"));
        structure.attach(new Woman("Rose"));

        Action success = new Success();
        structure.display(success);

        Action fail = new Fail();
        structure.display(fail);

        // 新增第三种状态，其他代码无需改动。符合开闭原则
        Action wait = new Wait();
        structure.display(wait);
    }
}
