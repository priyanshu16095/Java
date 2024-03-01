public class SquareRoot {
    public static void main(String[] args) {
        int num = 40;
        System.out.printf("%.3f", sqrt(num));
    }
    public static double sqrt(int num) {
        int start = 1;
        int end = num;
        double root = 0.0;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(mid*mid == num) {
                return mid;
            } else if(mid*mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        double incr = 0.1;
        for(int i = 0; i < 3; i++) {
            while(root*root <= num) {
                root += 0.1;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }    
}
