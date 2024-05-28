public class BuyAndSellStock {
    public static void main(String[] args) {
        int stock[] = { 1, 2, 0, 5, 1 };
        int left = 0;
        int right = left + 1;
        int max = 0;
        int buy = 0;
        int sell = 0;
        int diff = 0;

        while (right < stock.length) {
            if (stock[left] > stock[right]) {
                left = right;
                right++;
            } else {
                diff = stock[right] - stock[left];
                // System.out.println(diff);
                if (diff > max) {
                    max = diff;
                    buy = left + 1;
                    sell = right + 1;
                }
                right++;

            }
        }

        System.out
                .println("The best day to buy the stock is on day " + buy + " and to sell it is on day " + sell
                        + " .");
        System.out.println(stock.length);
    }
}
