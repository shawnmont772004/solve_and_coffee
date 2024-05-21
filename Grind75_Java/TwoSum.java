import java.util.HashMap;

public class TwoSum {

    public int[] twosum_func(int[] x, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int diff;
        for (int i = 0; i < x.length; i++) {
            diff = target - x[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            } else {
                map.put(x[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int x[] = { 1, 2, 4, 6, 9, 11 };
        int target = 11;

        TwoSum s = new TwoSum();
        int[] result = s.twosum_func(x, target);

        if (result.length == 2) {
            System.out.print("The indices are " + result[0] + "and " + result[1]);
        } else {
            System.out.println("No indices found");
        }
    }
}
