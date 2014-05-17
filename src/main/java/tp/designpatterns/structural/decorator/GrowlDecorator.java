/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.decorator;

public class GrowlDecorator extends AnimalDecorator{
    
    public GrowlDecorator(Animal animal) {
        super(animal);
    }
    
    @Override
    public String describe() {
        return growl();
    }
    
    public String growl() {
        return("Grrrrr.");
    }
}
