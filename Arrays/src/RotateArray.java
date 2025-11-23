import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6};
        int k=1;
        System.out.println(Arrays.toString(RotateArray(arr, k)));
    }
    static int[] RotateArray(int[] arr , int k){
        int[] CompRotate = reverse(arr , 0 , arr.length-1);
        int[] RotTillk = reverse(arr , 0 , k-1);
        int[] RotRemaining = reverse(arr , k , arr.length-1);
        return RotRemaining;
    }
    static int[] reverse(int[] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
        return arr;
    }
}
