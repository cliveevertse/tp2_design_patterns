/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.creational.builder;

public interface MealBuilder {
    
    public void buildDrink();
    public void buildMainCourse();
    public void buildSide();
    
    public Meal getMeal();
}
