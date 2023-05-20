import java.util.ArrayDeque;
import java.util.Deque;

public class BlockingDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(5);

        deque.add(0);
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);

        System.out.println("Текущая очередь: " + deque);
        System.out.println("Удаляем: " + deque.pollFirst() + " " + deque.pollLast());
        System.out.println("Текущая очередь: " + deque);
        System.out.println("Удаляем: " + deque.pollFirst() + " " + deque.pollLast());
        System.out.println("Текущая очередь: " + deque);
        System.out.println("Удаляем: " + deque.pollFirst() + " " + deque.pollLast());
        System.out.println("Текущая очередь: " + deque);
        System.out.println("Удаляем: " + deque.pollFirst() + " " + deque.pollLast());
    }
}
