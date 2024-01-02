package ArrayPrograms;

// How to Sort an Array in Java
//The sorting is a way to arrange elements of a list or array in a certain order. The order may be in ascending or descending order. The numerical and lexicographical (alphabetical) order is a widely used order.
//In this section, we will learn how to sort array in Java in ascending and descending order using the sort() method and without using the sort() method. Along with this, we will also learn how to sort subarray in Java.

public class SortArrayExample2 {
    public static void main(String[] args)
    {
        //creating an instance of an array
        int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.println("Array elements after sorting:");
        //sorting logic
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            //prints the sorted element of the array
            System.out.println(arr[i]);
        }
    }
}
