/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.bridge;

public class SmallEngine implements Engine {
    int horsepower;
    public SmallEngine() {
        horsepower = 100;
    }

    @ Override
    public int go() {
        return horsepower;
    }
}
