import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(findIndex(arr, target)));
    }
    static int[] findIndex(int[] nums , int target){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            if(nums[start]+nums[end] == target){
                return new int[] {start , end};
            }else if(nums[start]+nums[end] > target){
                end --;
            }else{
                start ++;
            }
        }
        return new int[] {-1,-1};
    }
}
