package tp.designpatterns.behavioral.state;

public class Queue implements QueueContext {   
    	
	protected QueueState state = new QueueEmpty();  
	
	public boolean insert(Object arg) {	
		return state.insert(this, arg);
	}
	
	public Object  getFirst() {		
		return state.getFirst(this);
	}
	
	public boolean removeFirst() {		// Removes the first element from the queue
		return state.removeFirst(this);
	} 
	
	public void setState(QueueState state) {
		this.state = state;
	}
}