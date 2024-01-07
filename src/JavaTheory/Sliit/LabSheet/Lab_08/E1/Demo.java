package JavaTheory.Sliit.LabSheet.Lab_08.E1;

public class Demo {
    public static void main(String[] args) {

        System.out.println("\n--------------- Normal Array Way ----------------  ");
        Integer[] arr = {2,4,1,8,12,3,4,8,9,21};
        int[] arrNormalWay = {2,4,1,8,12,3,4,8,9,21};
        Sort sort = new Sort();
        sort.bubbleSort(arrNormalWay);

        for(int i = 0; i < 10; i++) {
            System.out.print(arrNormalWay[i]+" ");
        }

        System.out.print("\n\n");


        System.out.println("\n--------------- Generics Float Array Way ----------------  ");
        Float[] arr2 = {2.3f, 5f, 4.5f, 5.4f, 8.9f, 7.4f, 2.5f, 6.8f, 1.7f, 9f};
        // sort.bubbleSort(arr2);
        SortGen<Float> sortFloat = new SortGen<Float>();
        sortFloat.bubbleSort(arr2);

        System.out.println("Sorted float array");
        for(int i = 0; i < 10; i++) {
            System.out.print(arr2[i]+" ");
        }

        System.out.print("\n\n");

        System.out.println("\n--------------- Generics Double Array Way ----------------  ");
        Double[] arr3 = {1.2, 3.5, 3.3, 6.5, 6.9, 7.3, 1.2, 3.6, 9.7, 9.8};
        // sort.bubbleSort(arr3);
        SortGen<Double> sortDouble = new SortGen<Double>();
        sortDouble.bubbleSort(arr3);

        System.out.println("Sorted double array");
        for(int i = 0; i < 10; i++) {
            System.out.print(arr3[i]+" ");
        }


        //use gen Method
        SortGen2 sortGen2 = new SortGen2();
        sortGen2.bubbleSort(arr2);
        sortGen2.bubbleSort(arr3);
        sortGen2.bubbleSort(arr);

        System.out.print("\n\n");

    }
}
