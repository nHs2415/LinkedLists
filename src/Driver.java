public class Driver {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(23);
        sll.insertFirst(35);
        sll.insertRear(14);
        sll.insertGivenPosition(16,3);
        sll.displayData();
        sll.deleteFirst();
        sll.deleteGivenValue(2);
        sll.displayData();
    }
}
