
public class List<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private String name;

    public List(){

        name = "List";
        firstNode = lastNode = null;
    }

    public List(String ListName){

        name = ListName;
        firstNode = lastNode = null;
    }

    public boolean isEmpty() {

        return firstNode == null;
    }

    public void insertAtFront(T insertItem){

        if(isEmpty()){

            firstNode  = lastNode = new Node<T> (insertItem);
        } else {

            firstNode = lastNode = new Node<T> (insertItem, firstNode);
        }
    }

    public void insertAtBack(T insertItem){

        if(isEmpty()){

            firstNode = lastNode = new Node<T>(insertItem);
        } else {

            lastNode.nextNode = new Node<T>(insertItem);
            lastNode = lastNode.nextNode;
        }
    }

    public String print(){

        String str = null;

        if(isEmpty()){

            str = "Empty " + name;
        } else {

            str = "The " + name + " is : \n\n";
        }

        Node <T> current = firstNode;

        while(current != null){

            str = str + current.getData() + "\n";
            current = current.getNext();
        }

        str = str + "\n";
        str = str + "End of " + name + "\n";

        return str;
    }

    public void removeAll(){

        firstNode = lastNode = null;
    }

    public T removeFromFront() throws EmptyListException {

        if(isEmpty()){
            throw new EmptyListException(name);
        }

        T removedItem = firstNode.getData();

        if(firstNode == lastNode){

            firstNode = lastNode = null;
        } else {

            firstNode = firstNode.getNext();
        }

        return removedItem;
    }

    public T removeFromBack() throws EmptyListException{

        if(isEmpty()){
            throw new EmptyListException(name);
        }

        T removedItem = lastNode.getData();

        if(firstNode == lastNode){

            firstNode = lastNode = null;
        } else {

            Node <T> current = firstNode;
            while(current.getNext() != lastNode){

                current = current.getNext();
            }

            lastNode = current;
            current.setNext(null);
        }

        return removedItem;


    }
}
