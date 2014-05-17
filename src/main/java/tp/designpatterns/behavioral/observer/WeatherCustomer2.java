/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.observer;

public class WeatherCustomer2 implements WeatherObserver{
    
    @Override
    public void doUpdate(int temperature){
        System.out.println("Weather customer2 just found out the temperature is:" + temperature);
    }
}
