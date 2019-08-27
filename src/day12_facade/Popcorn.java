package day12_facade;

public class Popcorn {
    /**
     * Popcorn单例
     */
    private static final Popcorn instance = new Popcorn();

    private Popcorn() {
    }

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Popcorn on...");
    }

    public void off() {
        System.out.println("Popcorn off...");
    }

    public void pop() {
        System.out.println("Popcorn pop...");
    }

    public void pause() {
        System.out.println("Popcorn pause...");
    }
}
