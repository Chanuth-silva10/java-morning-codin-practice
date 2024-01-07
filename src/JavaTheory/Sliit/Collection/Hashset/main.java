package JavaTheory.Sliit.Collection.Hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// E3
public class main {
    public static void main(String[] args) {

        //not allowed duplicate value
        //set demonstrate using Hashset Constructor
        Set<Integer> studentHeight = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++) {
            System.out.println("Enter height "+ (i + 1));
            studentHeight.add(sc.nextInt());

        }
        //Loop through a HashSet
        //Iterating the List element using for-each loop

        for(Integer object : studentHeight) {
            System.out.print(" " + object);
        }
        // not sorted and not allowed dublicate

    }
}
