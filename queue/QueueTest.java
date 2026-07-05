package queue;

public class QueueTest {

    public static void main(String args[]) {

        Queue queue = new Queue();

        queue.enqueue(-1);
        queue.print();

        queue.enqueue(0);
        queue.print();

        queue.enqueue(1);
        queue.print();

        queue.enqueue(5);
        queue.print();

      

    }

}