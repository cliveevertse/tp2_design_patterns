/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.chainofresponsibility;

public class VenusHandler extends PlanetHandler {
    
    @Override
    public String handleRequest(PlanetEnum request) {
        if(request == PlanetEnum.VENUS) {
            return "VenusHandler handles"+request +"Venus is poisonous.\n";
        } else {
            
            if(successor != null) {
                successor.handleRequest(request);
            }
            return("VenusHandler doesn't handle"+request);
        }
    }
}
