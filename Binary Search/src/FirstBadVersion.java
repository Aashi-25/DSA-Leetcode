public class FirstBadVersion {
    //You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
    static boolean isBadVersion(int n){
        return false;
    }
    public int badversion(int n){
        int start = 0;
        int end = n;
        while (start < end){
            int mid = start + (end-start)/2;
            boolean result = isBadVersion(mid);
            if (result == false){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
