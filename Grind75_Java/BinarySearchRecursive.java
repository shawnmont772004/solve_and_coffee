public class BinarySearchRecursive {

    public static int binarysearch(int[] arr, int k, int l, int r) {
        if (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (k < arr[mid]) {
                return binarysearch(arr, k, l, r - 1);
            } else {
                return binarysearch(arr, k, l + 1, r);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchRecursive b = new BinarySearchRecursive();
        int[] arr = { 1, 3, 5, 6, 7, 8, 11, 15, 18 };
        int key = 11;
        int left = 0;
        int right = arr.length - 1;

        int index = binarysearch(arr, key, left, right);

        if (index == -1) {
            System.out.println("The element is not found");
        } else {
            System.out.println("The element is  found in key " + index);
        }

    }
}