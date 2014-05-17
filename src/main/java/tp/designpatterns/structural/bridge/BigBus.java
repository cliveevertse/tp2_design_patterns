/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.bridge;

public class BigBus extends Vehicle{
    
    public BigBus (Engine engine) {
        this.weightInKilos = 3000;
        this.engine = engine;
    }
    
    @ Override
    public String drive() {
        int horsepower = engine.go();
        return reportOnSpeed(horsepower);
    }
}
