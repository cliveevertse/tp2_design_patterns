/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.creational.singleton;

public class SingletonExample {
    private static SingletonExample singletonExample = null;
    
    private SingletonExample() {
    }
    
    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }
    
    public String sayHello() {
        String message = "Hello";
        System.out.println(message);
        return message;
    }
}
