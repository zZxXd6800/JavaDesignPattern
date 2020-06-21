package day25_chain_of_responsibility;

/**
 * @author zhuxu
 * @date 2020/6/21 22:07
 */
public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() > 0 && request.getPrice() <= 5000) {
            System.out.println("request " + request.getId() + " handled by " + getName());
        } else if (getNext() != null) {
            approver.processRequest(request);
        } else {
            System.out.println("can not handle request...");
        }
    }
}
