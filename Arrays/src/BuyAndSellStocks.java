public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(MaxProfit(arr));
    }
    static int MaxProfit(int[] arr){
        int max = 0;
        int buy = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < buy){
                buy = num;
            }
            int profit = num-buy;
            if(profit > max){
                max = profit;
            }
        }
        return max;
    }
}
