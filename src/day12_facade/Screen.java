package day12_facade;

public class Screen {
    /**
     * Screen单例
     */
    private static final Screen instance = new Screen();

    private Screen() {
    }

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Screen up...");
    }

    public void down() {
        System.out.println("Screen down...");
    }
}
