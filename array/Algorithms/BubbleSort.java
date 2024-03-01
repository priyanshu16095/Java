package Algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3};
        bubbleSort(arr);
    }
    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
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