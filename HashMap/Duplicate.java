package HashMap;

import java.util.HashSet;

public class Duplicate {
    public static void main(String args[]) {
        int nums[] = { 1, 1, 2, 2, 3, 4, 5, 5, 66, 66, 8, 9 };
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                System.out.println(nums);
                return;
            }
            set.add(n);

        }
        System.out.println(false);
        // System.out.println(nums);
    }
}
