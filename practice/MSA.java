public class MSA {
    public static void main(String[] args) {
        MSA m = new MSA();
        int[] arr = {1,3,-5,6,1,-8,1,2,3,4,-2,5,6,0,-1,8 };

        int max_sum = -1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum +=  arr[i];
            if (sum > 0) {
                if (sum > max_sum) {
                    max_sum += arr[i];
                }
            } else {
                sum = 0;
            }
        }

        System.out.println("The maximum sum of subarray is" + max_sum);
    }
}
