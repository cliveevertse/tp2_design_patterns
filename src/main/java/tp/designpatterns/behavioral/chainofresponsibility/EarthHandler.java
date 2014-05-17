/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.chainofresponsibility;


public class EarthHandler extends PlanetHandler {
    
    @Override
    public String handleRequest(PlanetEnum request) {
        if(request == PlanetEnum.MERCURY) {
            return "EarthHandler handles"+request + "Earth is comfortable.\n";
        } else {
            
            if(successor != null) {
                successor.handleRequest(request);
            }
            return("EarthHandler doesn't handle"+request);
        }
    }
}
