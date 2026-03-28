// package HashMap;

// import java.util.HashMap;

// public class HashMapExample {
//     public static void main(String args[]) {
//         HashMap<String, Integer> map = new HashMap<>();
//         map.put("Eshwer", 21);
//         map.put("adhihtya", 20);
//         map.put("Egees", 23);

//         System.out.println(map.get("Eshwer"));

//     }

// }

package HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            System.out.println(map);

        }
    }
}
