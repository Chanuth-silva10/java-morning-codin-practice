package JavaTheory.Sliit.Tute.Generics.E3;


/*

Write a program having a static method called CalculateSum() to calculate the sum of the numbers passed to an arraylist.
Arraylist should be taken as a parameter to CalculateSum(), in the main method you could be able to calculate sum for integer or double or float

*/

import java.util.ArrayList;
import java.util.List;

public class sample {

    private static int CalculateSum(List<Integer> myarglist) {

        int sum = 0;

        for(Integer val : myarglist) {

            sum = sum + val;
        }
        return sum;
    }
    public static void main(String[] args) {
        List mylist = new ArrayList<>();
        mylist.add(19);
        mylist.add(10);

        System.out.println("Sum is = "+ CalculateSum(mylist));
    }

}
