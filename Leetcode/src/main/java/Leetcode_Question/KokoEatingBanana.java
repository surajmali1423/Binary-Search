package Leetcode_Question;

public class KokoEatingBanana {

    static int MaxElement(int [] arr){
         int ans = Integer.MIN_VALUE;

         for(int i = 0 ;i < arr.length; i++){
             if(arr[i] > ans) ans = arr[i];
         }

         return ans;
    }
    static long Hours(int [] arr , int hours){
         long totalHours = 0;

         for(int i = 0; i < arr.length; i++){
              totalHours += (long) Math.ceil(arr[i] / (double) hours);
         }

         return totalHours;
    }

    static int KokoEating(int [] arr , int h){
        int lo = 1;
        int hi = MaxElement(arr);
        int ans  = Integer.MAX_VALUE;
        while(lo <= hi){
             int mid = lo + (hi - lo) / 2;

             long totalHour = Hours(arr, mid);

             if(totalHour <= h){
                 ans =  mid;
                 hi = mid - 1;
             }
             else lo = mid + 1;
        }

        return ans;
    }
    static void main() {
         int [] arr = {805306368,805306368,805306368};
        System.out.println("Maximum Number : "+KokoEating(arr , 1000000000));
    }
}
