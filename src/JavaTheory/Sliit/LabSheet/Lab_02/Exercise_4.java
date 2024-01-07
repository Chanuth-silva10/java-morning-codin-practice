package JavaTheory.Sliit.LabSheet.Lab_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise_4 {
    public static void main(String[] args) {

        int h, l, w, v;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);

        try {
            System.out.println("Enter width :");
            l = Integer.parseInt(in.readLine());

            System.out.println("Enter Length :");
            w = Integer.parseInt(in.readLine());

            System.out.println("Enter Height :");
            h = Integer.parseInt(in.readLine());

            v = l * w * h;
            System.out.println("Volume is :"+v);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
