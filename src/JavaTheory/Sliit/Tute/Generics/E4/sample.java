package JavaTheory.Sliit.Tute.Generics.E4;

import java.util.Scanner;

public class sample {
    private static Integer[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();

        Integer[] myArray = new Integer[size];

        for(int i = 0; i<size; i++) {
            System.out.println("Enter thr value for the index "+ i);
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }
    private static Integer findMax(Integer[] values) {

        Integer max = values[0];

        for(int i = 1; i<values.length; i++) {

            if(max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {

        Integer myvalarray[] = takeInput();

        System.out.println(findMax(myvalarray));

    }
}
