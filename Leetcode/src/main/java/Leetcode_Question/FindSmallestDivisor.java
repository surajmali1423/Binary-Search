package Leetcode_Question;

public class FindSmallestDivisor {

    static int Maximum(int [] arr){
        int ans = Integer.MIN_VALUE;

        for(int i = 0 ;i < arr.length; i++){
            if(arr[i] > ans) ans = arr[i];
        }

        return ans;
    }

    static int ThresholdSum(int [] arr , int divisor){
          int sum = 0;

          for(int x : arr){
              sum += (int)Math.ceil( x / (double)divisor);
          }

          return sum;
    }
    static int FindDivisor(int [] arr , int threshold){
        int lo = 1;
        int hi = Maximum(arr);
        int ans = -1;

        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(ThresholdSum(arr , mid) <= threshold){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }

        return ans;
    }

    static void main() {
         int [] arr = {1 , 2, 5, 9};
         int threshold = 7;

        System.out.println("Smallest Given a Threshold Is : "+FindDivisor(arr , threshold));
    }
}
