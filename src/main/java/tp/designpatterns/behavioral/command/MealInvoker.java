/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.command;

public class MealInvoker {
    
    Command command;
     
    public MealInvoker(Command command) {
        this.command=command;
    }
    
    public void setCommand(Command command){
        this.command=command;
    }
    public String invoke(){
        return command.execute();
    }
}
