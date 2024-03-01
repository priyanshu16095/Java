package Algorithms;

// SELECTION SORT
// O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        selectionSort(arr);
    }
    // WORKS BY REPEATEDLY FINDING THE MINIMUM ELEMENT AND PUTTING AT THE BEGINNING
    // DIVIDES THE ARRAY INTO TWO PARTS: SORTED AND UNSORTED
    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            // ASSUME THE CURRENT INDEX IS MINIMUM
            int smallest = i;
            // FINDING THE INDEX OF MINIMUM ELEMENT
            for(int j = i+1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // SWAPPING THE MINIMUM ELEMENT WITH FIRST ELEMENT
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
