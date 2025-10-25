public class SearchInRSAwithDuplicates {
    static int FindPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if (arr[mid] > arr[mid+1]){
                return mid;
            } else if (arr[mid-1] > arr[mid]){
                return mid-1 ;
            }
            // if element at middle, start , and end are equal, then just skip the duplicates
            else if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates after checking if they are the pivot or not
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted so pivot should be in right
            else if(arr[start]< arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            } else{
                end = mid - 1;
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

    //performing binary search in rotated sorted array using pivot element
    static boolean BSusingPivot(int[]arr , int target ){
        int pivot = FindPivotWithDuplicates(arr);
        if (pivot == -1){
            return(BS(arr , target , 0 , arr.length-1)) != -1;
        } else {
            if (arr[pivot] == target) {
                return true;
            } else if (arr[0] < target) {
                return BS(arr, target, 0, pivot - 1) != -1;
            } else {
                return BS(arr, target, pivot + 1, arr.length - 1) != -1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(BSusingPivot(arr , target));
    }

}
