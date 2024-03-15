public class Driver {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        String [] d1={"Jack","Adams","0123456678"};
        l1.insertFirst(d1);
        String[] d2 ={"Harry","Smith","0981234567"};
        l1.insertFirst(d2);
        String [] d4={"Irene","Pear","0123456678"};
        l1.insertFirst(d4);

        String[] d5 = {"Tom","Adams","0981212345"};
        l1.insertFirst(d5);
        String[] d6 = {"Paul","Victor","0786712345"};
        l1.insertFirst(d6);
        //l1.printDetails();

        l1.removeStudent(4);
        //l1.printDetails();

        String[] d7 = {"Joe","Hardy","0123987653"};
        l1.insertFirst(d7);
        String[] d8 = {"Sally","Potter","0981234578"};
        l1.insertMiddle(d8,5);
        l1.printDetails();
    }
}
