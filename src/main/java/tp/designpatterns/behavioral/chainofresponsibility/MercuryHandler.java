/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.chainofresponsibility;

public class MercuryHandler extends PlanetHandler {
    
    @Override
    public String handleRequest(PlanetEnum request) {
        if(request == PlanetEnum.MERCURY) {
            return "MercuryHandler handles"+request + "Mercury is hot.\n";
    
        } else {
            
            if(successor != null) {
                successor.handleRequest(request);
            }
            return("MercuryHandler doesn't handle"+request);
        }
    }
}
