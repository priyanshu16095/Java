package comparable;

import java.util.*;

public class Nums {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i > j) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(8);
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
