public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int lowestPrice = prices[0];
        for(int i=0; i<prices.length; i++) {
            if(prices[i]<lowestPrice) lowestPrice = prices[i];
            profit = Math.max(profit, prices[i]-lowestPrice);
        }
        return profit;
    } 
}