package Leetcode_Question;

public class Minimum_Rotated_Sorted_Array {

    static int findMinimum(int [] arr){
        int lo = 0 ;
        int hi = arr.length - 1;

        int ans =  Integer.MAX_VALUE;

        while (lo <= hi){
             int mid = lo + (hi - lo) / 2;

             if(arr[lo] <= arr[mid]){
                  ans = Math.min(ans , arr[lo]);
                  lo = mid + 1;
             }
             else{
                 ans = Math.min(ans , arr[mid]);
                 hi = mid - 1;
             }
        }
        return ans;
    }

    static void main(String[] args) {
          int [] arr = {3,4,5,1,2,0};

        System.out.println(" the Smallest Elment is : "+findMinimum(arr));
    }
}
