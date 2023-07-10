package Day1;

import java.util.ArrayList;

public class Buy_and_Sell_stock {
    public static int maximumProfit(ArrayList<Integer> prices){
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        
        for(int i = 0 ; i < prices.size() ; i++){
            if(prices.get(i) < min_price){
                min_price = prices.get(i);
            }else if(prices.get(i) - min_price > max_profit){
                max_profit = prices.get(i) - min_price;
            }
        }
        
        return max_profit;
    }
}
