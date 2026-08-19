package Leetcode_Question;

public class FloorAndCoil {
    // Floor --> Largest number in array <= target
    static int Floor(int [] arr , int target){
          int lo = 0 ;
          int hi = arr.length - 1;
          int ans = -1;

          while(lo <= hi){
               int mid = lo + (hi - lo) / 2;

               if(arr[mid] <= target){
                    ans = mid;
                    lo = mid + 1;
               }
               else hi = mid - 1;
          }

          return ans;
    }

    // Coil Smallest Number in Array >= target
    static int Coil (int [] arr , int target){
         int lo = 0;
         int hi = arr.length - 1;
         int ans = -1;

         while(lo <= hi){
             int mid = lo + (hi - lo) / 2;

             if(arr[mid] >= target){
                 ans = mid;
                 hi = mid - 1;
             }
             else lo = mid + 1;
         }

         return ans;
    }

    static void main(String[] args) {

        int [] arr = {5, 6, 8, 9, 6, 5, 5, 6};

        int target1 = 7;
        int target2 = 7;

        System.out.println("Floor is : "+ Floor(arr , target1));
        System.out.println("Coil is : "+ Coil(arr, target2));
    }
}
