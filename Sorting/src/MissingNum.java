import java.sql.SQLOutput;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {0 , 1 , 3 , 4};
        System.out.println(findNum(arr));
    }
    static int findNum(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            int correct = i;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
}
