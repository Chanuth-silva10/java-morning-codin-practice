package JavaTheory.Sliit.LabSheet.Lab_02;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        int w, l , h , v = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("enetr width :");
        w = s.nextInt();
        System.out.println("Enter length :");
        l = s.nextInt();
        System.out.println("Enter height :");
        h = s.nextInt();

        v = w * h * l;

        System.out.println("Volume is :" + v);

    }
}
