import java.util.ArrayList;

public class ArrayPriorityQueue{

    private int _size;
    private int _queue;
    
    public ArrayPriorityQueue(){
	_size = 0;
	_queue = new ArrayList();
    }
    
    public void add( Object x ){
	if ( isEmpty() ){
	    _queue.add(x);
	    _size++;
	}
	else {
	    //smaller int gets priority
	    int placeHolder = _size / 2;
	    while (){
		
	    }
	    _size++;
	}	
    }

    public boolean isEmpty(){
	return _size == 0;
    }

    public Object peekMin(){
	if ( isEmpty() ){
	    throw new IllegalStateException("queue is empty, cannot check from queue");
	}
	return _queue.get(_size-1);
    }

    public Object removeMin(){
	if ( isEmpty() ){
	    throw new IllegalStateException("queue is empty, cannot remove from queue");
	}
	Object ret = _queue.remove(_size-1);
	_size--;
	return ret;
    }
}
