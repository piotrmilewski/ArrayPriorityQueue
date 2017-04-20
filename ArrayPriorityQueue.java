import java.util.ArrayList;

public class ArrayPriorityQueue<Object>{

    private int _size;
    private ArrayList<Object> _queue;
    
    public ArrayPriorityQueue(){
	_size = 0;
	_queue = new ArrayList<Object>();
    }
    
    public void add( Object x ){
	if ( isEmpty() ){
	    _queue.add(x);
	    _size++;
	}
	else {
	    //smaller int gets priority
	    int placeHolder = 0;
	    while (placeHolder < _size && x.compareTo(_queue.get(placeHolder)) > 0){
		placeHolder++;
	    }
	    _queue.add(placeHolder,x);
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

    public static void main(String[] args){
	
    }
}
