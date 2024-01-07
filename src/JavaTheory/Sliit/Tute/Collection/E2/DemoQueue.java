package JavaTheory.Sliit.Tute.Collection.E2;

import java.util.PriorityQueue;

public class DemoQueue {

    public static void main(String[] args) {

        PriorityQueue<Patient> myQueue = new PriorityQueue<>();

        myQueue.add(new Patient("Perera", 10,8));
        myQueue.add(new Patient("Amali", 25,2));
        myQueue.add(new Patient("Nayani", 5,3));

        while(!myQueue.isEmpty()) {
            System.out.println(myQueue.poll().name );
        }

    }
}
