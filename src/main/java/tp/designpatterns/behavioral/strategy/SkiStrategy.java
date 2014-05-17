/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.strategy;

public class SkiStrategy implements Strategy{
    @Override
    public boolean checkTemperature(int temperatureInF) {
        if(temperatureInF >= 32) {
           return true;
        } else {
            return false;
        }
    }
}
