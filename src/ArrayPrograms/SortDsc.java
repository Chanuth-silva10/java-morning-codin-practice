package ArrayPrograms;

// Java Program to sort the elements of an array in descending order
// In this program, we need to sort the given array in descending order such that elements will be arranged from largest to smallest.
// This can be achieved through two loops. The outer loop will select an element, and inner loop allows us to compare selected element with rest of the elements.

public class SortDsc {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {5, 2, 8, 7, 1};
        int temp = 0;

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sort the array in descending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
