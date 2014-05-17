package tp.designpatterns.behavioral.state;

public class QueueNormal implements QueueState {

    protected Object[] items = new Object[3];

    protected int first = 0;

    protected int last = 0;

    public QueueNormal(Object[] items, int first, int last) {
        this.items = items;
        this.first = first;
        this.last = last;
    }

    public QueueNormal() {
    }

    public boolean insert(QueueContext context, Object arg) {
        items[(last) % items.length] = arg;
        last = (last + 1) % items.length;
        if (first == last) {
            context.setState(new QueueFull(items, first));
        }
        return true;
    }

    public Object getFirst(QueueContext context) {
        return items[first];
    }

    public boolean removeFirst(QueueContext context) {
        first = (first + 1) % items.length;
        if (first == last) {
            context.setState(new QueueEmpty());
        }
        return true;
    }
}
