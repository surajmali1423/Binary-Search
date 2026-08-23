package Leetcode_Question;

public class CountRotatedSortedArray {

    static int RotatedCount(int [] arr ){
        int lo = 0;
        int hi = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

//  if the Complete Array Will Sorted :
            if(arr[lo] <= arr[hi]){
                if(arr[lo] < ans){
                    index = lo;
                    ans = arr[lo];
                }

                break;
            }

//             Do Like Find The Minimun Element in Sorted Array
            if(arr[lo] <= arr[mid]){
                if(arr[lo] < ans){
                    index = lo;
                    ans = arr[lo];
                }
                lo = mid + 1;
            }
            else{
                if(arr[mid] < ans){
                    index = mid;
                    ans = arr[mid];
                }
                hi = mid - 1;
            }
        }

        return index;
    }

    static void main() {
        int [] arr = {7, 9, 11, 12, 5};

        System.out.println("Rotation Count in a Rotated Sorted array : "+RotatedCount(arr));
    }
}
