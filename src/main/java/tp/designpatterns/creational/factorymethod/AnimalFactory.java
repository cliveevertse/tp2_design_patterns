/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.creational.factorymethod;

public class AnimalFactory {
    
    private static AnimalFactory animalFactory;
    
    private AnimalFactory() {
    }
    
    public static AnimalFactory getInstance() {
        if (animalFactory == null) {
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }
    
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    } 
}
