import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }

        /*stack.push(0);
        stack.push(1);
        stack.push(2);*/

        System.out.println("Текущий стек: " + stack);
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Текущий стек: " + stack);
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Текущий стек: " + stack);
        System.out.println("Удаляем: " + stack.pop());
    }
}
