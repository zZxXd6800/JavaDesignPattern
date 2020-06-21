package day25_chain_of_responsibility;

/**
 * @author zhuxu
 * @date 2020/6/21 22:01
 */
public abstract class Approver {
    private String name;
    protected Approver approver;

    public Approver(String name) {
        this.name = name;
    }

    public Approver getNext() {
        return approver;
    }

    public void setNext(Approver next) {
        this.approver = next;
    }

    public String getName() {
        return name;
    }

    public abstract void processRequest(PurchaseRequest request);
}
