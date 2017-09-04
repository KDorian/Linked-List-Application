
public class Node<T> {

    private T data;
    Node<T> nextNode;

    public Node(T data){

        this.data = data;
        nextNode = null;
    }

    public Node(T data, Node <T> next){

        this.data = data;
        nextNode = next;
    }

    public void setData(T data){

        this.data = data;
    }

    public T getData(){

        return data;
    }

    public void setNext(Node<T> next){

        this.nextNode = next;
    }

    public Node <T> getNext(){

        return nextNode;
    }

}
