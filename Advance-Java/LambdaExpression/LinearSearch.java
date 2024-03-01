package src.java.LambdaExpression;

public class LinearSearch {
    @FunctionalInterface
    public interface linearSearch {
        void searching(int[] arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 16, 8, 69, 3};

        linearSearch ls = (int[] nums) -> {
            for(int i = 0; i < nums.length; i++) {
                for(int  j = 1; j <= nums.length-i-1; j++) {
                    if(arr[j] > arr[j-1]) {
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }
            System.out.println("Sorted array is: ");
            for(int i = 0; i < nums.length; i++) {
                System.out.print(arr[i] + " ");
            }
        };
        ls.searching(arr);

    }

}
