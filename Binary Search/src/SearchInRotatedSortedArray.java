public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3 , 4 , 5 , 6 , 7 , 0 , 1 , 2};
        int target = 2;
        System.out.println(BSusingPivot(arr , target));
    }
    //performing binary search in rotated sorted array using pivot element
    static int BSusingPivot(int[]arr , int target ){
        int pivot = FindPivot(arr);
        if (pivot == -1){
            return(BS(arr , target , 0 , arr.length-1));
        } else {
            if (arr[pivot] == target) {
                return pivot;
            } else if (arr[0] < target) {
                return BS(arr, target, 0, pivot - 1);
            } else {
                return BS(arr, target, pivot + 1, arr.length - 1);
            }
        }
    }
    static int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if (arr[mid] > arr[mid+1]){
                return mid;
            } else if (arr[mid-1] > arr[mid]){
                return mid-1 ;
            } else if(arr[start] >= arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int BS (int[] arr , int target , int start , int end ){
        while (start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }

}
