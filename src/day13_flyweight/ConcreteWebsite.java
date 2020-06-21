package day13_flyweight;

public class ConcreteWebsite extends Website {
    /**
     * 共享的部分，内部状态
     */
    private String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(WebsiteUser user) {
        System.out.println("Website type: " + type + ", User: " + user.getName());
    }
}
