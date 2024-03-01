package HashMaps;
import java.util.HashSet;

public class Intersection {
    static void intersection(int[] a, int[] b) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for(int j = 0; j < b.length; j++) {
            if(set.contains(b[j])) {
                count++;
                set.remove(b[j]);
                System.out.print(b[j] + " ");
            }
        }
        System.out.println();
        System.out.println("Count: " + count);
    }
    
    public static void main(String[] args) {
        int[] a = {7, 3, 9};
        int[] b = {6, 3, 9, 2, 9, 4};
        intersection(a, b);
    }
}