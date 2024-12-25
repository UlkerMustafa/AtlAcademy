package Generic;

public class Main {
    public static void main(String[] args) {
        GenericQueue <Integer> intQueue=new GenericQueue<>();
        intQueue.enqueue(11);
        intQueue.enqueue(22);
        intQueue.enqueue(33);


        System.out.println("queue cixdi "+ intQueue.dequeue());
   System.out.println("queue bosdur? "+ intQueue.isEmpty());


   GenericQueue<String> stringQueue =new GenericQueue<>();
   stringQueue.enqueue("Salam");
   stringQueue.enqueue("Sagol");

        System.out.println("queue cixdi: "+ stringQueue.dequeue());
        System.out.println("queue bosdur? "+ stringQueue.isEmpty());
   }
}
