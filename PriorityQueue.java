public interface PriorityQueue {
    
    //add a value into the Queue and place it in the array based on its priority as compared to other values in the Queue
    public void add(Object x);

    //check if the Queue is empty
    public boolean isEmpty();

    //check the most prioritized value in the Queue without dequeueing the value
    public Object peekMin();

    //dequeue the most prioritized value in the Queue and return that dequeued value
    public Object removeMin();

}
