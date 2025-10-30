public class GuessNumber {
    static int guess (int num){
//        You call a pre-defined API int guess(int num), which returns three possible results:
//
//        -1: Your guess is higher than the number I picked (i.e. num > pick).
//        1: Your guess is lower than the number I picked (i.e. num < pick).
//        0: your guess is equal to the number I picked (i.e. num == pick).
        return -1;
    }

    static int FindNum(int n){
        //n is the number picked by computer
        int start = 1;
        int end = n;
        while (start <= end){
            int mid = start + (end-start)/2;
            int result = guess(mid);
            if(mid == -1){
                end = mid-1;
            }else if(mid == 1){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
