public class CircularSinglyLinkedList {
    Node last;
    int length;
    public CircularSinglyLinkedList(){
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        if (this.length == 0){
            return true;
        }else {
            return false;
        }
    }

    public void printData(){
        if (last == null){
            return;
        }

        Node first = last.getNext();
        while (first != last){
            System.out.print(first.getData() + " ");
            first = first.getNext();
        }
        System.out.print(first.getData());
    }

    public void insertFirst(int value){
        Node temp = new Node(value);
        if (last == null){
            last = temp;
        }else {
           temp.setNext(last.getNext());
        }
        last.setNext(temp);
        length++;

    }

    public void insertEnd(int value){
        Node temp = new Node(value);
        if (last == null){
            last = temp;
            last.setNext(last);
        }else {
            temp.setNext(last.getNext());
            last.setNext(temp);
            last = temp;
        }
    }

    public Node removeFirstNode(){
        if (isEmpty()){
            System.out.println("No such Element");
        }

        Node temp = last.getNext();
        if (last.getNext() == last) {// have one node
            last = null;
        }else {
            last.setNext(temp.getNext());
        }
        temp.setNext(null);
        length--;
        return temp;
    }


}
