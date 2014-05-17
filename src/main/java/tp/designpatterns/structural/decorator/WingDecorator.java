/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.decorator;

public class WingDecorator extends AnimalDecorator{
    
    public WingDecorator(Animal animal) {
        super(animal);
    }
    
    @Override
    public String describe() {
        return animal.describe() + "I have wings. " + fly();
    }
    
    public String fly() {
        return("I can fly.");
    }
}
