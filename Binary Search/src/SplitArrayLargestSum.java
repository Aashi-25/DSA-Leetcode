public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(search(nums , k));
    }
    static int search(int[]nums , int k){
        //k here refers to the number of subarrays an array ca be broken into
        int start=0;
        int end=0;
        for (int i=0 ; i<nums.length ; i++){
            start = Math.max(start , nums[i]);
            end += nums[i];
        }
        while (start<end){
            int mid = start + (end-start)/2 ;
            int sum = 0;
            int pieces = 0;
            for(int num : nums){
                if(sum+num <= mid){
                    sum += num;
                } else{
                    sum = num; //new subarray created
                    pieces++; //count of subarrays increased by 1
                }
            }
            if(pieces < k){
                end = mid;
            } else{
                start = mid+1;
            }
        }
        return start;
    }
}
