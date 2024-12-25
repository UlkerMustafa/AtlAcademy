package Generic;

import java.util.LinkedList;


public class GenericQueue <T>{
    private LinkedList<T> queue;

    public GenericQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(T element){
        queue.addLast(element);
    }

    public T dequeue (){
        if (isEmpty()){

            throw  new IllegalStateException("Queue bosdur");
        }  return queue.removeFirst();
    }


    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
