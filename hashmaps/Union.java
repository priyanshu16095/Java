package HashMaps;

import java.util.HashSet;

public class Union {
    static void unionOfTwoArrays(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for(int j = 0; j < b.length; j++) {
            set.add(b[j]);
        }
        for(int key : set) {
            System.out.print(key + " ");
        }
        System.out.println();
        System.out.println("Size: " + set.size());
    }

    public static void main(String[] args) {
        int[] a = {1, 6, 9, 12, 15, 3, 7, 56};
        int[] b = {1, 6, 3, 7, 56, 20};
        unionOfTwoArrays(a, b);
    }
}