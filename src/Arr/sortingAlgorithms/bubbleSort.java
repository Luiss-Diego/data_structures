package Arr.sortingAlgorithms;

public class bubbleSort {

    public static int[] bubbleSorting(int[] arr){
        for (int i = 0; i < arr.length-1;i++){ //
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                int temp = arr[j];      // Almacena el valor de la posicion J "anterior" para no perderlo
                arr[j] = arr[j+1]; // se intercambia el valor de la posicion "J+1" posterior con la anterior "J"
                arr[j+1] = temp; // almacenamos el valor anterior "J" en la posicion "J+1"
                }

            }
        }
        return arr;
    }


    public static int[] bubbleSortingV2(int[] arr){
        int[] newArr = arr.clone();
        for (int i = 0; i < newArr.length-1;i++){
            for (int j = 0; j < newArr.length-1-i; j++){
                if (newArr[j] > newArr[j+1]){
                    int temp = newArr[j];      // Almacena el valor de la posicion J "anterior" para no perderlo
                    newArr[j] = newArr[j+1]; // se intercambia el valor de la posicion "J+1" posterior con la anterior "J"
                    newArr[j+1] = temp; // almacenamos el valor anterior "J" en la posicion "J+1"
                }

            }
        }
        return newArr;
    }


}
