/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.mediator;

public class FrenchBuyer extends Buyer{
    public FrenchBuyer(Mediator mediator){
        super(mediator,"euro");
        this.mediator.registerFrenchBuyer(this);
    }
}
