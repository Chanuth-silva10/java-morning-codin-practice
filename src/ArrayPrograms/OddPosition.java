package ArrayPrograms;

// Program to print the elements of an array present on odd position
// In this program, we need to print the elements of the array which are present in odd positions.
// This can be accomplished by looping through the array and printing the elements of an array by incrementing i by 2 till the end of the array is reached.

public class OddPosition {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("Elements of given array present on odd position: ");
        //Loop through the array by incrementing value of i by 2
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}
