package Leetcode_Question;

public class LowerAndUpperBound {

    static int Lower(int [] arr , int target){
        int n = arr.length;
       int lo = 0 ;
       int hi = n - 1;
       int ans = n;

       while(lo <= hi){
             int mid = (lo + (hi - lo)/2);

             if(arr[mid] >= target) {
                 ans = mid;
                 hi = mid - 1;
             }
             else lo = mid + 1;
       }

       return ans;
    }

    static int Upper(int [] arr , int target){
        int n = arr.length;
        int lo = 0 ;
        int hi = n - 1;
        int ans = n;

        while(lo <= hi){
            int mid = (lo + (hi - lo)/2);

            if(arr[mid] > target) {
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }

        return ans;
    }

    static void main() {

        int [] arr = {1 , 2 , 3 , 3, 5 , 8 , 8 , 10 ,10 , 11};

        int ans = Upper(arr , 3);
        System.out.println(ans);
    }
}
