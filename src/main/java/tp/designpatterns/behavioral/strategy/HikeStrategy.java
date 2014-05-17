/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.strategy;

public class HikeStrategy implements Strategy{
    @Override
    public boolean checkTemperature(int temperatureInF) {
        if((temperatureInF >= 50) && (temperatureInF <= 90)) {
           return true;
        } else {
            return false;
        }
    }
}
