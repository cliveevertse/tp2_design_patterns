/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.proxy;

import java.util.Date;

public abstract class Thing {
    public String sayHello() {
        return this.getClass().getSimpleName() + " says howdy at " + new Date();
    }
}
