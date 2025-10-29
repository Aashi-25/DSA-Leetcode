public class FindSqrt {
    public static void main(String[] args) {
//        int x = 1;
//        int start = 0;
//        int end = x/2;
//        int ans = 0;
//        while (start <= end){
//            int mid = start + (end-start)/2 ;
//            long sqr = (long) mid*mid;
//            if (sqr == x){
//                ans = mid;
//                break;
//            } else if(sqr > x){
//                end = mid-1;
//            }else{
//                start = mid+1;
//            }
//        }
//        System.out.println(end);
        int x = 49;
        System.out.println(sqrt(x));
    }
    static int sqrt(int x){
        int start = 1;
        int end = x/2;
        if (x==1 || x==0){
            return x;
        }
        while(start <= end){
            int mid = start + (end-start)/2 ;
            long sqr = (long) mid*mid;
            if (sqr == x){
                return mid;
            }else if(sqr > x){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end;
    }
}
