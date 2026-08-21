package Leetcode_Question;

public class Search_Rotated_Sorted_Array_2 {

    static Boolean Search_Rotated_Sorted(int [] arr ,  int target){
         int lo = 0;
         int hi = arr.length - 1;

         while (lo <= hi){

             int mid = lo + (hi - lo) / 2;

             if(arr[lo] == arr[mid] && arr[mid] == arr[hi]){
                   lo++;
                   hi--;
                   continue; // change to the next element may be the same number so that why
             }

             if(arr[mid] == target) return true;

             // Left Part Sortef
             if(arr[lo] <= arr[mid]){

                 if(arr[lo] <= target && arr[mid] > target) hi = mid - 1;
                 else lo = mid + 1;
             }else{ // Right part Sorted

                 if(arr[hi] >= target && arr[mid] < target) lo = mid + 1;
                 else hi = mid - 1;
             }

         }


         return false;
    }

    static void main(String[] args) {
      int [] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
      int target = 2;


        System.out.println("The Target "+target+" is present "+Search_Rotated_Sorted(arr , target));
    }
}
