package Day4;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class StackQueue {
    public static void main(String[] args) {
        // 1. Stack implementation
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Peek element: " + stack.peek());
        // removing peek element
        System.out.println("Popping the peek element: " + stack.pop());
        System.out.println("After removed stack elements:- ");
        for (int i: stack) {
            System.out.println(i);
        }
        System.out.println("Total number of elements: " + stack.size());
        System.out.println("is this empty stack? " + stack.isEmpty());

        // 2. queue implementation
        System.out.println();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue elements:- ");
        for (int i: queue) {
            System.out.println(i);
        }
        System.out.println("Peek element: " + queue.peek());
        queue.remove();
        System.out.println("Queue elements: ");
        for (int i: queue) {
            System.out.println(i);
        }
        System.out.println("Queue contains 10? " + queue.contains(10));
        System.out.println("Queue contains 20? " + queue.contains(20));
    }
}
