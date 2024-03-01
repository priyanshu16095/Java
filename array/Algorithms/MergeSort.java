package Algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 8, 2};
        divide(arr, 0, arr.length-1);
        printArray(arr);
    }

    // DIVIDE AND CONQUER APPROACH
    public static void divide(int[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex) { // SINGLE ELEMENT CONDITION
            return;
        }
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        divide(arr, startIndex, midIndex); // 1ST HALF
        divide(arr, midIndex+1, endIndex); // 2ND HALF

        conquer(arr, startIndex, midIndex, endIndex);
    }

    public static void conquer(int[] arr, int startIndex, int midIndex, int endIndex) {
        int merged[] = new int[endIndex - startIndex + 1];

        int idx1 = startIndex;    // TRACKING 1ST ARRAY
        int idx2 = midIndex + 1; // TRACKING 2ND ARRAY
        int x = 0;                // TRACKING MERGED ARRAY

        while(idx1 <= midIndex && idx2 <= endIndex) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1 <= midIndex) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
        while(idx2 <= midIndex) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }
        // COPYING ELEMENTS OF MERGED INTO ORIGINAL ARRAY
        for(int i = 0, j = startIndex; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
