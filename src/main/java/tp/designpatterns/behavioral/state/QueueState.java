package tp.designpatterns.behavioral.state;

public interface QueueState {

    public boolean insert(QueueContext context, Object arg);

    public Object getFirst(QueueContext context);

    public boolean removeFirst(QueueContext context);

}
