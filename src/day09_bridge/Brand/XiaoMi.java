package day09_bridge.Brand;

public class XiaoMi implements IBrand {
    @Override
    public void open() {
        System.out.println("open XiaoMi...");
    }

    @Override
    public void close() {
        System.out.println("close XiaoMi...");
    }

    @Override
    public void call() {
        System.out.println("XiaoMi call...");
    }
}
