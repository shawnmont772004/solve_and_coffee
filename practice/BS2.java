package practice;

public class BS2 {

    public int binarysearch(int arr[], int k, int l, int r) {
        if (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                return binarysearch(arr, k, mid + 1, r);
            } else {
                return binarysearch(arr, k, l, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 10, 13, 15 };
        int k = 9;
        int l = 0;
        int r = arr.length - 1;

        BS2 b = new BS2();
        int index = b.binarysearch(arr, k, l, r);

        if (index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is found at index " + index);
        }

    }
}
