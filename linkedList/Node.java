package linkedList;
public class Node <D> {
//In this all the properties of a boggy shall be present.
    //All the properties
    Node <D> next;
    D data;

    public Node (D newData){
        data = newData;
        next = null;
    }
    public Node (D newdata, Node newNext){
        data = newdata;
        next = newNext;
    }

    //getters and setters
    public D getData(){
        return data;
    }
    public Node<D> getNext (){
        return next;
    }

    public void setData(D newData) {
        data = newData;
    }

    public void setNext(Node<D> newNode) {
        next = newNode;
    }
}
