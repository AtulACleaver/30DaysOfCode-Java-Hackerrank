package linkedList;

import java.util.LinkedList;

public class Train<D>{
    /*we can do multiple things:-
    - Ability to add nodes
    - Ability to remove nodes
    - How many nodes in thes sequence?
    - Is the sequence empty?
    - Retrieve data from node class
     */
    //Properties
    Node<D> head;
    int count;

    //Constructors
    public Train(){
        head = null;
        count = 0;
    }
    public Train(Node<D> newHead){
        head = newHead;
        count = 1;
    }

    //Methods
    //add
    public void add(int newData){
        Node<D> temp = new Node(newData);
        Node<D> current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    //get
    public D get(int index){
//        if (index<=0){
//            return -1;
//        }
        Node<D> current = head;
        for (int i = 1; i<index; i++){
            current = current.getNext();
        }
        return current.getData();
    }
    //Size
    public int size(){
        return count;
    }
    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }
    //remove
    public void remove(){
        //remove from the back of the list
        Node<D> current = head;
        while(current.getNext().getNext() != null){
            current=current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Atul");
        System.out.println(linkedList);
        linkedList.add("Jayant");
        System.out.println(linkedList);

    }



}
