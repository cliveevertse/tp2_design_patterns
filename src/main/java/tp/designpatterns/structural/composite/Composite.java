/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    List<Component> components = new ArrayList<Component>();
    
    @Override
    public String sayHello() {
        String message = "";
        
        for (Component component : components) {
           message += component.sayHello() + "\n";
        }
        
        return message;
    }

    @Override
    public String sayGoodbye() {
        String message = "";
        
        for (Component component : components) {
           message += component.sayGoodbye() + "\n";
        }
        
        return message;
    }
    
    public void add(Component component) {
        components.add(component);
    }
    
    public void remove(Component component) {
        components.remove(component);
    }
    
    public List<Component> getComponents() {
        return components;
    } 
    
    public Component getComponent(int index) {
        return components.get(index);
    }
}
