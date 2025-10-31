public class PerfectSquare {
    public static void main(String[] args) {
        int num = 64;
        System.out.println(isPerfectSquare(8));
    }
    static boolean isPerfectSquare(int num){
        int start = 0;
        int end = num/2;
        while(start <= end){
            int mid = start + (end-start)/2;
            int sqr = mid*mid;
            if (sqr == num){
                return true;
            }else if(sqr < num){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
