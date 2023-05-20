import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(5);

        queue.add(0);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);


        System.out.println("Текущая очередь: " + queue);
        System.out.println("Удаляем: " + queue.poll());
        System.out.println("Текущая очередь: " + queue);
        System.out.println("Удаляем: " + queue.poll());
        System.out.println("Текущая очередь: " + queue);
        System.out.println("Удаляем: " + queue.poll());
        System.out.println("Текущая очередь: " + queue);
        System.out.println("Удаляем: " + queue.poll());
        System.out.println("Текущая очередь: " + queue);
        System.out.println("Удаляем: " + queue.poll());
    }
}
