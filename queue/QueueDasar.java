package queue;
import java.util.LinkedList;
import java.util.Queue;


public class QueueDasar {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Andi");
        queue.offer("Budi");
        queue.offer("Cici");

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);
    }
}