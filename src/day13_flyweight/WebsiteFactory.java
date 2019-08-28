package day13_flyweight;

import java.util.HashMap;

public class WebsiteFactory {
    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    public Website getWebsite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    public int getWebsiteCount() {
        return pool.size();
    }
}
