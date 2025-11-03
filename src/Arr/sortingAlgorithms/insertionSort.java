package Arr.sortingAlgorithms;

public class insertionSort {

    public static int[] insertionSortMethod(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }




}
