public class BinarySearch {

    public int binary(int[] arr, int k) {

        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            System.out.println(mid);
            if (k == arr[mid]) {
                return mid;

            } else if (k < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 6, 9, 11, 15 };
        int key = 5;

        BinarySearch b = new BinarySearch();
        int index = b.binary(a, key);
        if (index != -1) {
            System.out.println("The element found in index " + index);
        } else {
            System.out.println("The element is not present ");
        }

    }
}
