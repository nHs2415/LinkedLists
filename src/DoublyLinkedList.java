import com.sun.security.auth.UnixNumericGroupPrincipal;

public class DoublyLinkedList {
    Node head;
    Node tail;
     int length;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length=0;
    }

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

    public void printDataForwardDirection(){
        if (head == null){
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.getData() + " --> ");
            temp =temp.getNext();
        }
        System.out.println("null");
    }

    public void printDataBackwardDirection(){
        if (head == null){
            return;
        }
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.getData() +" --> ");
            temp = temp.getPrevious();
        }
        System.out.println("null");
    }

    public void insertFront(int value){
        Node newNode = new Node(value);
        if (isEmpty()){
            tail = newNode;
        }else {
            head.setPrevious(newNode);
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void insertBack(int value){
        Node newNode = new Node(value);
        if (isEmpty()){
            head = newNode;
        }else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
    }

    public Node deleteFirst(){
        if (isEmpty()){
            System.out.println("No such element");;
        }
        Node temp = head;
        if (head == tail){
            tail = null;
        }else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        temp.setNext(null);
        return temp;

    }

    public Node deleteLastNode(){
        if (isEmpty()){
            System.out.println("No Such Element");
        }
        Node temp = tail;
        if (head == tail){
            head = null;
        }else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        temp.setPrevious(null);
        return temp;
    }
    
}
