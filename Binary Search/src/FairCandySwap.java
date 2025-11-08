import java.util.Arrays;
import java.util.HashSet;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {2,1};
        int[] bobSizes = {3 , 2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }
    static int[] fairCandySwap(int[] aliceSizes , int[] bobSizes){
        int AliceSum = 0;
        int BobSum = 0;
        for(int num : aliceSizes){
            AliceSum += num;
        }
        for (int num : bobSizes){
            BobSum += num;
        }

        //create a hashset for lookup in O(1) time complexity
        HashSet<Integer> set = new HashSet<>();

        //store the difference of candies given by Alice to bob and Bob to Alice in a variable
        int dif = (AliceSum - BobSum)/2;

        //store the value of dif in hashset
        for(int b:bobSizes){
            set.add( b + dif );
        }

        //check if the value of a match any value in hashset
        for(int a : aliceSizes){
            if (set.contains(a)) {
                int b= a-dif;
                return new int[]{a , b};
            }
        }
        return new int[]{-1 , -1};
     }
}
