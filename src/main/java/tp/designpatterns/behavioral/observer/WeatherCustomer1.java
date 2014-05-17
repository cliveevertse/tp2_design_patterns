/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.observer;

public class WeatherCustomer1 implements WeatherObserver{
    
    @Override
    public void doUpdate(int temperature){
        System.out.println("Weather customer1 just found out the temperature is:" + temperature);
    }
}
