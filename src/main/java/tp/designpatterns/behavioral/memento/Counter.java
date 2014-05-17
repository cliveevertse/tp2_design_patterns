package tp.designpatterns.behavioral.memento;

public class Counter {

    protected int currentValue = 0;

    public void increment() {
        currentValue++;
    }

    public void show() {
        System.out.println("Originator value is " + currentValue);
    }

    public CounterMemento createMemento() {
        return new CounterMemento(currentValue);
    }

    public void setMemento(CounterMemento memento) {
        currentValue = memento.getState();
    }
}
