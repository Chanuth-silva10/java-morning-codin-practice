package JavaTheory.Sliit.LabSheet.Lab_02;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number :");
        int  k = s.nextInt();
        EvenOddNumber e1 =  new EvenOddNumber();
        boolean re = e1.findEvenOrOdd(k);
        if(re == true) {
            System.out.println("Even");
        }else {
            System.out.println("false");
        }
    }
}
