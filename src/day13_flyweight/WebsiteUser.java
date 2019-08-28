package day13_flyweight;

/**
 * 外部状态
 */
public class WebsiteUser {
    private String name;

    public String getName() {
        return name;
    }

    public WebsiteUser setName(String name) {
        this.name = name;
        return this;
    }
}
