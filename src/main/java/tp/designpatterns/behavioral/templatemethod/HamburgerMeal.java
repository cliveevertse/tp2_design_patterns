/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.templatemethod;

public class HamburgerMeal extends Meal {

   @Override
    public String prepareIngredients(){
        return("Getting burgers, buns, and french fries");
    }
   
    @Override
    public String cook(){
        return("Cooking burgers on grill and fries in oven");
    }
    
    @Override
    public String cleanUp() {
        return("Throwing away paperplates");
    }

}
