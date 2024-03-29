package ArrayPrograms;
// Java Program to remove duplicate element in an Array
//We can remove duplicate element in an array by 2 ways: using temporary array or using separate index. To remove the duplicate element from array, the array must be in sorted order. If array is not sorted, you can sort it by calling Arrays.sort(arr) method.
public class RemoveDuplicateInArrayExample {
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main (String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
}