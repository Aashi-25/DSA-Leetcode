//since rotation is concerned so find pivot

public class FindKthRotation {
    public static void main(String[] args) {
        int[] arr = {5,6, 1, 2, 3, 4};
        int pivot = FindPivot(arr);
        System.out.println(pivot+1);
    }

    static int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            } else if(mid-1>start && arr[mid-1] > arr[mid]){
                return mid-1;
            } else if(arr[start] > arr[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
}
