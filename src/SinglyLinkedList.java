public class SinglyLinkedList {
    Node head;
    Node tail;
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    //inserting a value to the first
    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    public void displayData(){
        Node current = head;
        while (current != null){
            System.out.print(current.getData() + "-->");
            current = current.getNext();
        }
        System.out.println("");
    }

    public int getLength(){
        int count = 0;
        Node current = head;
        while (current != null){
           current= current.getNext();
           count++;
        }
        System.out.println(count);
        return count;

    }

    public void insertRear(int value){
        Node newNode = new Node(value);
        if (head == null){
            head.setNext(newNode);
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(newNode);
        newNode.setNext(null);
    }

    public void insertGivenPosition(int value,int position){
        Node newNode = new Node(value);
        if (position == 1){
            insertFirst(value);
            return;
        }else {
            Node previous = head;
            int count = 1;
            while (count < position - 1){
               previous = previous.getNext();
               count++;
            }
            Node current = previous.getNext();
            newNode.setNext(current);
            previous.setNext(newNode);
        }

    }

    public Node deleteFirst(){
        if (head == null){
            return null;
        }else {
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            return temp;
        }
    }

    public Node deleteGivenValue(int position){
        if (head == null){
            return null;
        } else if (position == 1) {
            head = head.getNext();
        }else {
            Node previous = head;
            int count = 1;
            while (count < position - 1){
                previous = previous.getNext();
                count++;
            }
            Node current = previous.getNext();
            previous.setNext(current.getNext());
        }
        return null;
    }

}
