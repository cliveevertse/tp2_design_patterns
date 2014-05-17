package tp.designpatterns.behavioral.state;

public class QueueEmpty implements QueueState {

    public boolean insert(QueueContext context, Object arg) {
        QueueNormal nextState = new QueueNormal();
        context.setState(nextState);
        return nextState.insert(context, arg);
    }

    public Object getFirst(QueueContext context) {
        return null;
    }

    public boolean removeFirst(QueueContext context) {
        return false;
    }

}
