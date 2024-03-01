public class Driver {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFront(23);
        dll.insertFront(34);
        dll.insertBack(67);
        dll.deleteFirst();
        dll.printDataForwardDirection();
        dll.printDataBackwardDirection();
    }
}
