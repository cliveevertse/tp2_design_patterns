/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.command;

public class LunchCommand implements Command {

    Lunch lunch;
        
    public LunchCommand(Lunch lunch){
        this.lunch=lunch;
    }
    
    @Override
    public String execute(){
        return lunch.makeLunch();
    }
}
