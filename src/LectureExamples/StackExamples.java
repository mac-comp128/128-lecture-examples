package LectureExamples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class StackExamples {

    public static void main(String[] args){
        
        // Initializing a stack in Java using deque class with arraydeque implementation
        Deque<String> stackOfStrings = new ArrayDeque<String>();
        
        // Initializing a stack in Java using deque class with linked list implementation
        //Deque<String> stackOfStrings = new LinkedList<String>();

        // Add an element to the stack using push method
        stackOfStrings.push("apple");

        // Take a look at the top of the stack using peek method
        System.out.println(" ");
        System.out.println("The current top element is: "+stackOfStrings.peek());

        // Push two more elements to the top of the stack
        stackOfStrings.push("pear");
        stackOfStrings.push("kiwi");

        // Now the top of the stack will be the last element added 
        System.out.println("The current top element is: "+stackOfStrings.peek());
        System.out.println(" ");

        // An example of iterating through a stack
        while(!stackOfStrings.isEmpty()){
            System.out.println("Element popped: "+stackOfStrings.pop());

            // What to do if all elements are popped from a stack?
        }

        // Check the size of the stack after popping all elements
        System.out.println(" ");
        System.out.println("The current size of the stack: "+stackOfStrings.size());
        

    }
}
