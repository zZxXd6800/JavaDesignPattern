package day12_facade;

public class DVDPlayer {
    /**
     * DVDPlayer单例
     */
    private static final DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {
    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVDPlayer on...");
    }

    public void off() {
        System.out.println("DVDPlayer off...");
    }

    public void play() {
        System.out.println("DVDPlayer play...");
    }

    public void pause() {
        System.out.println("DVDPlayer pause...");
    }
}
