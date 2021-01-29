package queuey;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuey <D>{
    LinkedList<D> queue;

    //Making a queue instance
    public Queuey(){
        queue = new LinkedList();
    }

    //is our queue empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    //the size of the list
    public int size(){
        return queue.size();
    }
    //Enqueuing an item
    public void enqueue(D n){
        queue.addLast(n);


    }
    //Dequeuing an item
    public D dequeue(){
        return queue.remove(0);
    }
    //peek at the first item.
    public D peek(){
        return queue.get(0);
    }
    public static void main(String[] args) {

        Stack<String> stacky = new Stack<>();
        stacky.push("there.");
        stacky.push("hi ");
        System.out.print(stacky.pop());
        System.out.print(stacky.pop());
        System.out.println(stacky.size());
        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("hola");
        stringQueue.enqueue("mangola");

        System.out.println(stringQueue.dequeue() + " ");
        System.out.println(stringQueue.dequeue() + " ");
//
        System.out.println(stringQueue.size());
//        it gets at the last of the list.
        Queuey numQueue = new Queuey();
        numQueue.enqueue(5);
        numQueue.enqueue(3);
        numQueue.enqueue(10);
        numQueue.enqueue(4);
        System.out.println("First out:- " + numQueue.dequeue());
        System.out.println("Second out:- "+ numQueue.dequeue());
        System.out.println("Third out:- " + numQueue.dequeue());

    }
}
