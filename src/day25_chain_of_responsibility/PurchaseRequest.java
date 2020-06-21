package day25_chain_of_responsibility;

/**
 * 请求类
 */
public class PurchaseRequest {
    private int type;
    private int id;
    private float price;

    public PurchaseRequest(int type, int id, float price) {
        this.type = type;
        this.id = id;
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }
}
