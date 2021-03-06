package day25_chain_of_responsibility;

/**
 * @author zhuxu
 * @date 2020/6/21 22:08
 */
public class MasterApprover extends Approver {
    public MasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() > 30000) {
            System.out.println("request " + request.getId() + " handled by " + getName());
        } else if (getNext() != null) {
            approver.processRequest(request);
        } else {
            System.out.println("can not handle request...");
        }
    }
}
