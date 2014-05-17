/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.templatemethod;

public abstract class Meal {
    
    public final String doMeal() {
        return prepareIngredients() + cook() + eat() + cleanUp();
    }
    
    public abstract String prepareIngredients();
    
    public abstract String cook();
    
    public String eat() {
        return("Mmm, that's good");
    }
    
    public abstract String cleanUp();
}
