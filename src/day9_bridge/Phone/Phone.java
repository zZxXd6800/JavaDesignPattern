package day9_bridge.Phone;

import day9_bridge.Brand.IBrand;

public abstract class Phone {
    private IBrand brand;

    public Phone(IBrand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void close() {
        brand.close();
    }

    public void call() {
        brand.call();
    }
}
