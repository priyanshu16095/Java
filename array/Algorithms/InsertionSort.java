package Algorithms;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        insertionSort(arr);
    }

    // DIVIDE ARRAY INTO TWO PARTS SORTED AND UNSORTED
    // WE USUALLY CONSIDER ONLY ONE ELEMENT AS OUT SORTED PART  
    static void insertionSort(int arr[]) {
        // UNSORTED PART
        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1; // INDEX OF SORTED SINGLE ELEMENT
            while(j >= 0 && current > arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }

    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
