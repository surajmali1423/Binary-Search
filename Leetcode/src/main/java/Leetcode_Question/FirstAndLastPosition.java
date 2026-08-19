package Leetcode_Question;

public class FirstAndLastPosition {

//     Fint the First Position
    static int FirstElement(int [] arr , int target){
         int n = arr.length - 1;
         int lo = 0;
         int hi = n;
         int ans = -1;

         while(lo <= hi){
              int mid = lo + (hi - lo) / 2;

              if(arr[mid] == target){
                  ans = mid;
                  hi = mid - 1;
              }
              else if(target < arr[mid]) hi = mid - 1;
              else lo = mid + 1;
         }

         return ans;
    }
//  Last Position of the Element

    static int LastPosition(int [] arr , int target){
        int n = arr.length - 1;
        int lo = 0;
        int hi = n;
        int ans = -1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(arr[mid] == target){
                ans = mid;
                lo = mid + 1;
            }
            else if(target < arr[mid]) hi = mid - 1;
            else lo = mid + 1;
        }

        return ans;
    }

    static int [] FirstAndLastElement1(int [] arr , int target){
         int first = FirstElement(arr , target);
         int last = LastPosition(arr , target);

         return new int[]{first , last};
    }

    static int [] FirstAndLastElement2(int [] arr , int target){
          int lo = 0;
          int hi = arr.length - 1;
          int first = -1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(arr[mid] == target){
                first = mid;
                hi = mid - 1;
            }
            else if(target < arr[mid]) hi = mid - 1;
            else lo = mid + 1;
        }

          lo = 0;
          hi = arr.length - 1;
          int second = -1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(arr[mid] == target){
                second = mid;
                lo = mid + 1;
            }
            else if(target < arr[mid]) hi = mid - 1;
            else lo = mid + 1;
        }

        return new int[]{first , second};
    }

    static int Occurance(int [] ans){
         return ans[1] - ans[0] + 1;
    }
    static void main(String[] args) {
        int [] arr = { 5 , 7 , 7  , 8 ,8 , 8, 10};
        int target = 7;

        int [] ans = FirstAndLastElement2(arr , target);

        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
