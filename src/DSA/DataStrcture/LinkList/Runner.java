package DSA.DataStrcture.LinkList;

public class Runner {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insertAtStart(15);
        list.insertAt(0, 55);

        list.deleteAt(2);

        list.show();
    }
}
