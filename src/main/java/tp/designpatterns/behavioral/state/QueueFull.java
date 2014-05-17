package tp.designpatterns.behavioral.state;

public class QueueFull implements QueueState {

    protected Object[] items;

    protected int first;

    public QueueFull(Object[] items, int first) {
        this.items = items;
        this.first = first;
    }

    public boolean insert(QueueContext context, Object arg) {
        return false;
    }

    public Object getFirst(QueueContext context) {
        return items[first];
    }

    public boolean removeFirst(QueueContext context) {
        QueueState nextState = new QueueNormal(items, first, first);
        context.setState(nextState);
        return nextState.removeFirst(context);
    }
}
