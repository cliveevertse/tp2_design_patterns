/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.bridge;

public class BigEngine implements Engine {
    int horsepower;
    public BigEngine() {
        horsepower = 350;
    }

    @ Override
    public int go() {
        return horsepower;
    }
}
