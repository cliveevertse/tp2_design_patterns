/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.command;

public class DinnerCommand implements Command {

    Dinner dinner;
        
    public DinnerCommand( Dinner dinner){
        this.dinner=dinner;
    }
    
    @Override
    public String execute(){
        return dinner.makeDinner();
    }
}
