package practice;

public class BYS {
    public static void main(String[] args) {
        int[] stock = { 3, 2, 5, 9, 2, 8, 1, 3, 9, 7 };
        int i = 0;
        int j = 1;
        int max = -1;
        int buy = 0;
        int sell = 0;

        while (j < stock.length) {
            if (stock[i] < stock[j]) {
                int diff = stock[j] - stock[i];
                if (diff > max) {
                    max = diff;
                    buy = i+1;
                    sell = j+1;
                }
                j++;
            } else {
                i = j;
                j++;
            }
        }

        System.out.println("the best day to buy the stck is on the day " + buy + "and sell it on day " + sell);
    }
}
