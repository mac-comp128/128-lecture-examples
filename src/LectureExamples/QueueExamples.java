package LectureExamples;

import java.util.Queue;
import java.util.ArrayDeque;

public class QueueExamples {
    public static void main(String[] args){
        // Initializing
        Queue<String> stackOfStrings = new ArrayDeque<String>();
        // Queue<String> stackOfStrings = new LinkedList<String>();

        // Enqueue 
        stackOfStrings.add("Apple");
        stackOfStrings.offer("Apple");

        // Dequeue
        stackOfStrings.remove();
        stackOfStrings.poll();

        //stackOfStrings.remove();
        System.out.println(stackOfStrings.poll());

        // Peek
        //stackOfStrings.element();
        //stackOfStrings.peek();



    }
}
