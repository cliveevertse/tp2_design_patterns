/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.proxy;

public class Proxy {
    
    SlowThing slowThing;
    
    public Proxy() {
        
    }
    
    public String sayHello() {
        if(slowThing == null) {
            slowThing = new SlowThing();
        }
        return slowThing.sayHello();
    }
}
