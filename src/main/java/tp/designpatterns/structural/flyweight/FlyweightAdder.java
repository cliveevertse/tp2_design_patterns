/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.flyweight;

public class FlyweightAdder implements Flyweight{
    
    String operation;

    public FlyweightAdder() {
        operation = "adding";
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        } 
    }

    @Override
    public String doMath(int a, int b) {
          return operation + " " + a + " and " + b + ": " + (a+b);
    }
    
}
