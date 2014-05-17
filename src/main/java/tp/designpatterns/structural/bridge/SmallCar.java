/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.bridge;

public class SmallCar extends Vehicle{
    
    public SmallCar (Engine engine) {
        this.weightInKilos = 600;
        this.engine = engine;
    }
    
    @ Override
    public String drive() {
        int horsepower = engine.go();
        return reportOnSpeed(horsepower);
    }
}
