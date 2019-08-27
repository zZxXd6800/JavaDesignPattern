package day12_facade;

/**
 * 外观模式：也叫过程模式
 * 定义一个高层接口，用以屏蔽内部子系统的实现细节，使得调用端只需要跟这个接口发生调用，而无需关心子系统的内部细节
 * 注意事项：
 *      1.让客户端和子系统解耦，使得子系统内部模块更容易维护和拓展
 *      2.合理使用外观模式可以帮助我们更好的划分访问的层次，当系统需要分层设计时，可以考虑使用外观模式
 *      3.不能过多的或不合理的使用外观模式，若子系统本来就比较简单，客户端可以直接依赖子系统
 */
public class Facade {
    //定义各个子系统的对象
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;

    public Facade() {
        dvdPlayer = DVDPlayer.getInstance();
        popcorn = Popcorn.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        dvdPlayer.on();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        screen.up();
        projector.off();
        dvdPlayer.off();
    }
}
