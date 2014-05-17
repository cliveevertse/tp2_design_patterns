/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.mediator;

public class SwedishBuyer extends Buyer{
    public SwedishBuyer(Mediator mediator){
        super(mediator,"krona");
        this.mediator.registerSwedishBuyer(this);
    } 
}
