public class Driver {
    public static void main(String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        cll.insertFirst(3);
        cll.insertFirst(4);
        cll.insertEnd(5);
        cll.removeFirstNode();
        cll.printData();

    }
}
