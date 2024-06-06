package practice;
public class BS1 {

    public int binarysearch(int[] arr, int k, int l, int r) {
        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 9, 11, 14, 19, 23, 25 };
        int key = 19;
        int l = 0;
        int r = arr.length;

        BS1 b = new BS1();
        int index = b.binarysearch(arr, key, l, r);

        if (index == 0) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is found at index " + index);
        }
    }
}