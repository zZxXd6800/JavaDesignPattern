package day12_facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.ready();
        facade.play();
        facade.pause();
        facade.end();
    }
}
