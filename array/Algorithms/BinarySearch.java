package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3};
        int target = 2;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
