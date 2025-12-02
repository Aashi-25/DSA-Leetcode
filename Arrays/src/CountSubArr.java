import java.util.HashMap;

public class CountSubArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        System.out.println(Find(arr , k));
    }
    static int Find(int[] arr , int k){
        int preSum = 0;
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , 1);
        for(int num : arr) {
            preSum += num;
            if (map.containsKey(preSum - k)) {
                count += map.get(preSum - k);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
