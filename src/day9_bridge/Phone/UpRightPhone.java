package day9_bridge.Phone;

import day9_bridge.Brand.IBrand;

public class UpRightPhone extends Phone {
    public UpRightPhone(IBrand brand) {
        super(brand);
    }

    public void open() {
        System.out.print("upright phone: ");
        super.open();
    }

    public void close() {
        System.out.print("upright phone: ");
        super.close();
    }

    public void call() {
        System.out.print("upright phone: ");
        super.call();
    }
}
