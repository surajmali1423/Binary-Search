package Leetcode_Question;

// m = number of the boqui
// k = pair of the flower in booqui
public class MinimumNumberOfDaysToBloom {

   static int Min(int [] arr){
        int ans  = Integer.MAX_VALUE;

        for (int x : arr){
            if(x < ans){
                 ans = x;
            }
        }

        return ans;
    }
    static int Max(int [] arr){

        int ans  = Integer.MIN_VALUE;

        for (int x : arr){
            if(x > ans){
                ans = x;
            }
        }

        return ans;
    }

    static Boolean Possible(int [] arr , int day , int m , int k){
          int cnt = 0;
          int numberOfB = 0;
          for(int x : arr){
                if(x <= day) cnt++;
                else {
                    numberOfB += (cnt / k);
                    cnt = 0;
                }
          }

        numberOfB += (cnt / k);

          return numberOfB >= m;
    }

    static int MinimumDays(int [] arr , int m , int k){
          int lo = Min(arr);
          int hi = Max(arr);
          int ans = -1;


          while (lo <= hi){

              int mid  = lo + (hi - lo) / 2;

              if(Possible(arr , mid , m , k)){
                  ans = mid;
                  hi =  mid - 1;
              }

              else lo = mid + 1;
          }

          return ans;
    }
    static void main() {
        int [] arr = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;

        System.out.println("The Minimum number of the bloom the pair : "+MinimumDays(arr , m , k));
    }
}
