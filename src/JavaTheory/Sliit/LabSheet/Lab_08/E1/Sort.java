package JavaTheory.Sliit.LabSheet.Lab_08.E1;

public class Sort {

    // arr = 2 4 1 8 12 3 4 8  21
    void bubbleSort(int[] arr)
    {
        int n = arr.length; // 5
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {

                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
