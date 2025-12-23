package LeetCodeQuestions.ArraysQuestions;

public class SellAndBuyStock {
    public static void main(String[] args) {
 int [] price ={7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
    public static int maxProfit(int[] prices) {
int buy_price=prices[0];
int profit=0;
for (int i=0; i< prices.length;i++){
    if (prices[i] < buy_price){
        buy_price=prices[i];
    }else {
        int current_profit = prices[i]-buy_price;
        profit= Math.max(profit,current_profit);
    }
}
return profit;
    }

}
