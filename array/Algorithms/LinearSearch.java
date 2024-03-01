package Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3};
        int target = 2;
        int index = linearSearch(arr, target);
        System.out.println(index);
    }
    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
