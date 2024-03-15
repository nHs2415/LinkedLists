public class Node {
    String lastName;
    String firstName;
    String contactNumber;

    String[] data = {lastName, firstName, contactNumber};
    Node next;

    public Node(){

        this.next = null;
    }

    public Node(String[] data){
        this.data = data;

    }
}
