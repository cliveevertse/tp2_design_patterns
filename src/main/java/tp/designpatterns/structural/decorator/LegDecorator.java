/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.decorator;

public class LegDecorator extends AnimalDecorator{
    
    public LegDecorator(Animal animal) {
        super(animal);
    }
    
    @Override
    public String describe() {
        return animal.describe() + "I have legs. " + dance();
    }
    
    public String dance() {
        return("I can dance.");
    }
}
