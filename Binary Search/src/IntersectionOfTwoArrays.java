import java.util.*;
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1 , 2, 4 , 5 , 3};
        int[] nums2 = {4 , 3 , 1, 6, 10};
        System.out.println(Arrays.toString(intersectionUsingMap(nums1 , nums2)));
    }
// done using hashset
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0;
            int j=0;
            HashSet<Integer> set = new HashSet<>();
            while(i<nums1.length && j<nums2.length){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                    i++;
                    j++;
                }else if(nums1[i] < nums2[j]){
                    i++;
                }else{
                    j++;
                }
            }
            int[] ans = new int[set.size()];
            int idx = 0;
            for(int num : set){
                ans[idx++] = num;
            }

            return ans;
        }

// done using hashMap (gives better optimal solution)
    static int[] intersectionUsingMap(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int num : nums1){
            map.put(num , 1);
        }
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num)==1){
                ans.add(num);
                map.put(num , 0);
            }
        }
        int[] result = new int[ans.size()];
        for(int i=0 ; i<ans.size() ; i++){
            result[i] = ans.get(i);
        }
        return result;
    }

}
