package Leetcode_Question;

public class Search_Rotated_Sorted_Array {
    static int RotatedSorted(int [] arr , int target){
         int lo = 0;
         int hi = arr.length - 1;

         while (lo <= hi){
              int mid = lo + (hi - lo) / 2;

              if(arr[mid] == target) return mid;

              if(arr[lo] <= arr[mid]){
                  if(arr[lo] <= target && arr[mid] > target) hi = mid - 1;
                  else lo = mid + 1;
              }
              else{
                  if(arr[hi] >= target || arr[mid] < target) lo = mid + 1;
                  else hi = mid - 1;
              }
         }

         return -1;
    }

    static void main(String[] args) {
          int [] arr = {4,5,6,7,8,1,2};
          int target = 1;

        System.out.println("The number are present at the Index : "+ RotatedSorted(arr , target));
    }
}
