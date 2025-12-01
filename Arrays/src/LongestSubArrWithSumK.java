import java.util.HashMap;

public class LongestSubArrWithSumK {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        System.out.println(ArrWithPos(arr , k));
    }
    static int ArrWithPos(int[] arr, int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0 ; i<arr.length-1 ; i++){
            sum += arr[i];
            map.put(sum , i);
            if(sum == k){
                len = i+1;
            }else{
                if(map.containsKey(sum-k) && i-map.get(sum-k) > len){
                    len = i-map.get(sum-k);
                }
            }
        }
        return len;
    }
}
