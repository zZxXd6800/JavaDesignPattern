package day25_chain_of_responsibility;

/**
 * 职责链：为了避免请求发送者与多个请求处理者耦合在一起，将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链；当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止
 * 在责任链模式中，客户只需要将请求发送到责任链上即可，无须关心请求的处理细节和请求的传递过程，将请求的发送者和请求的处理者解耦
 */
public class ChainOfResponsibility {
    public static void main(String[] args) {
        DepartmentApprover department = new DepartmentApprover("department");
        ColleagueApprover colleague = new ColleagueApprover("colleague");
        ViceMasterApprover viceMaster = new ViceMasterApprover("vice master");
        MasterApprover master = new MasterApprover("master");

        // 构成环形的职责链
        department.setNext(colleague);
        colleague.setNext(viceMaster);
        viceMaster.setNext(master);
        master.setNext(department);

        // department -> colleague -> viceMaster -> master
        PurchaseRequest request = new PurchaseRequest(1,1, 30001);
        department.processRequest(request);

        // colleague -> viceMaster -> master -> department
        request = new PurchaseRequest(1, 2, 1000);
        colleague.processRequest(request);
    }
}
