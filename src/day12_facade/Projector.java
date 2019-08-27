package day12_facade;

public class Projector {
    /**
     * Projector单例
     */
    private static final Projector instance = new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector on...");
    }

    public void off() {
        System.out.println("Projector off...");
    }

    public void play() {
        System.out.println("Projector play...");
    }

    public void pause() {
        System.out.println("Projector pause...");
    }
}
