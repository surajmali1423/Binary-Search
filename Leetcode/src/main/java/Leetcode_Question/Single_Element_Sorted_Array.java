package Leetcode_Question;

public class Single_Element_Sorted_Array {

//    There is one catch if the answer present on the right the (even , odd)
//    if mid-point at odd index and the mid - 1 point at the same element then the left part eliminate;
//    if mid-point at even index and the mid + 1 point at the same element then the left part eliminate;
//     vice versa for the right;
    static int singleNonDuplicate(int [] arr){
           int n = arr.length;
           int lo = 1;
           int hi = n - 2;
           while (lo <= hi){

               int mid = lo + (hi - lo) / 2;

               if(arr[0] != arr[1]) return arr[0];

               if(arr[n-1] != arr[n-2]) return arr[n-1];

               if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) return arr[mid];

               if(mid % 2  != 0 && arr[mid] == arr[mid - 1] ||
                  mid % 2 == 0 && arr[mid] == arr[mid + 1] )
                   lo = mid + 1;

               else hi = mid - 1;
           }

           return arr[0];
    }

    static void main() {
         int [] arr = {1,1,2,2,3,3,4,8,8};

        System.out.println("The Single Element Is : "+singleNonDuplicate(arr));
    }
}
