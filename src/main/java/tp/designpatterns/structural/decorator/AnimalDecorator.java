/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.decorator;

public class AnimalDecorator implements Animal {
    
    Animal animal;
    
    public AnimalDecorator (Animal animal) {
        this.animal = animal;
    }

    @Override
    public String describe() {
        return animal.describe();
    }
}
