package Leetcode_Question;

public class Peak_Index_Mountain_Array {
    static int MountainArray(int [] arr){
         int lo = 0;
         int hi = arr.length - 1;

         while (lo <= hi){
             int mid = lo + (hi - lo) / 2;

             if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;

             if(arr[mid] > arr[mid+1]) hi = mid;
             else lo = mid + 1;
         }

         return -1;
    }

    static void main() {
         int [] arr = {18,29,38,59,98,100,99,98,90};
        System.out.println("The Mountain Element Is : "+MountainArray(arr));
    }
}
