import java.util.NoSuchElementException;

public class LinkedList {
    Node head;
    Node tail;
    int length = 0;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        if (head == null & tail == null){
            return true;
        }else {
            return false;
        }
    }

    public void insertFirst(String[] data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void insertEnd(String[] data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head.next = newNode;
            head = newNode;
        }else {
            Node current=head;
            while(current.next != null){
                current=current.next;
            }
            current.next = newNode;
        }
        tail = newNode;

    }

    public void insertMiddle(String[] data,int position){
        Node newNode = new Node(data);
        Node current = head;
        int index = 1;

        while (current != null){
            if (index == position - 1){
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;
            }
            current = current.next;
            index++;
        }
    }

    public void removeStudent(int position){
        if (isEmpty()){
            throw new NoSuchElementException("No student to delete");

        }

        Node current = head;
        int index = 1;
        while (current != null){
            if (position == 1){
                head = null;
                tail = null;
                System.out.println("Student removed successfully");
                System.out.println();
            }
            Node temp =current.next;
            if (index == position-1){
                current.next = temp.next;
                System.out.println("Student removed successfully");
                System.out.println();
            }
            current = current.next;
            index++;
        }


    }

    public void printDetails(){
        if (isEmpty()){
            throw new NoSuchElementException("No details to print");
        }else {
            Node current = head;
            while (current != null){
                for (int i=0; i<current.data.length; i++){
                    System.out.println(current.data[i]);

                }
                current = current.next;
                System.out.println();
            }
            System.out.println();
        }

    }
}
