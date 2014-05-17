/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    
    private static FlyweightFactory flyweightFactory;
    private Map<String, Flyweight> flyweightPool;
    
    private FlyweightFactory() {
        flyweightPool = new HashMap<String, Flyweight>();
    }
    
    public static FlyweightFactory getInstance() {
        if(flyweightFactory == null) {
            flyweightFactory = new FlyweightFactory();
        }
        return flyweightFactory;
    }
    
    public Flyweight getFlyWeight(String key) {
        if(flyweightPool.containsKey(key)) {
            return flyweightPool.get(key);
        } else {
            Flyweight flyweight;
            if("add".equals(key)) {
                flyweight = new FlyweightAdder();
            } else {
                flyweight = new FlyweightMultiplyer();
            }
            flyweightPool.put(key, flyweight);
            return flyweight;
        }
    }
}
