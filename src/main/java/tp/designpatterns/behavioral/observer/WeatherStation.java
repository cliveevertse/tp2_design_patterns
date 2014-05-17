/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.behavioral.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WeatherStation implements WeatherSubject {
    
    Set<WeatherObserver> weaStherObservers;
    int temperature;
            
    public WeatherStation(int temperature) {
        weaStherObservers = new HashSet<WeatherObserver>();
        this.temperature = temperature;
    }
    
    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weaStherObservers.add(weatherObserver);
    }
    
    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weaStherObservers.remove(weatherObserver);
    }
    
    @Override
    public void doNotify() {
        Iterator<WeatherObserver> it = weaStherObservers.iterator();
        while(it.hasNext()) {
            WeatherObserver weatherObserver=it.next();
            weatherObserver.doUpdate(temperature);
        }
    }
    public void setTemperature(int newTemperature) {
        System.out.println("\nWeather station setting temperature to"+newTemperature);
        temperature = newTemperature;
        doNotify();
    }
}
