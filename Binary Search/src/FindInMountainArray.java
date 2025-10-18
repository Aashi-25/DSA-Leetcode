public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,1,0};
        int target = 3;
        int peak = FindPeakElement(arr);
        int FirstTry = AgnosticBS(arr , target , 0 , peak);
        if (FirstTry != -1) {
            System.out.println(FirstTry);
        } else {
            System.out.println(AgnosticBS(arr , target , peak + 1 , arr.length - 1));
        }
    }
    static int AgnosticBS (int[] arr , int target , int start , int end){
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start)/2 ;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (arr[mid] < target){
                    start = mid + 1;
                } else if (arr[mid] > target){
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target){
                    end = mid - 1;
                } else if (arr[mid] > target){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int FindPeakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start+ (end - start)/2;
            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
