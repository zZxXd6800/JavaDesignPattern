package day09_bridge.Brand;

public class Vivo implements IBrand {
    @Override
    public void open() {
        System.out.println("open Vivo...");
    }

    @Override
    public void close() {
        System.out.println("close Vivo...");
    }

    @Override
    public void call() {
        System.out.println("Vivo call...");
    }
}
