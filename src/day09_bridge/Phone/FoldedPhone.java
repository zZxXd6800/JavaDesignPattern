package day09_bridge.Phone;

import day09_bridge.Brand.IBrand;

public class FoldedPhone extends Phone {
    public FoldedPhone(IBrand brand) {
        super(brand);
    }

    public void open() {
        System.out.print("folded phone: ");
        super.open();
    }

    public void close() {
        System.out.print("folded phone: ");
        super.close();
    }

    public void call() {
        System.out.print("folded phone: ");
        super.call();
    }
}
