package sdestriverSheet;

public class BestTimeToBuyNSell {
	public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0; i<prices.length; i++){
            // min = Math.min(min, prices[i]);
            // max = Math.max(max, prices[i] - min);

            if(prices[i] < min){
                min = prices[i];
            }else if(prices[i] - min > max){
                max = prices[i]-min;
            }
        }
        return max;
    }
}
