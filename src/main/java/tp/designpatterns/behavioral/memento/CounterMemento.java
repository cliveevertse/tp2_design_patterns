package tp.designpatterns.behavioral.memento;

public class CounterMemento {

    private int state;

    public void setState(int newState) {
        state = newState;
    }

    public int getState() {
        return state;
    }

    public CounterMemento(int init) {
        state = init;
    }
}
