public class ArrangingCoins {
    public static void main(String[] args) {
        //k equals the total number of coins provided
        int k = 10;
        System.out.println(CompletedRows(k));
    }
    static int CompletedRows(int k){
        int start = 0;
        int end = k;
        int ans = 0;
        while (start<=end){
            int mid = start + (end-start)/2;
            int coins = (mid * (mid+1))/2;
            if(coins > k){
                end = mid-1;
            }else if(coins <= k){
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
}
