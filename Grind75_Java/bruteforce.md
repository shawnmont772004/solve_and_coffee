public class BuyAndSellStock {
    public static void main(String[] args) {
        int stock[] = { 3, 1, 4, 5, 2, 9 };
        int max = 0;
        int buy = 0;
        int sell = 0;
        for (int i = 0; i < stock.length-1; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] <= stock[j]) {
                    int diff = stock[j] - stock[i];
                    if (max < diff) {
                        max = diff;
                        buy = i + 1;
                        sell = j + 1;
                    }
                }
            }
        }
        System.out.println("The best day to buy the stock is on " + buy + " day and to sell it is on" + sell + "day.");
        System.out.println(stock.length);
    }
}
