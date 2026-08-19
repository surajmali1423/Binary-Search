package Leetcode_Question;

public class NumberOfOccurrence {

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
    static int Occurance(int [] arr , int target){
         int first = FirstElement(arr , target);
         if(first == -1) return 0;
         int second = LastPosition(arr , target);
         return second - first + 1;
    }

    static void main() {
        int [] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;

        System.out.println("The Occurrence Of "+target+" is "+Occurance(arr , target));


    }
}
