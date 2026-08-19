package Leetcode_Question;

public class Search_Insert_Position {

    static int InsertPosition(int [] arr , int target){

        int lo = 0;
        int hi = arr.length  - 1;
        int ans = arr.length;

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

    static void main() {
        int [] arr = {1 , 2 , 4 , 7 , 10 , 11 , 14};
        int target  = 13;

        System.out.println("The "+target+" Insert At the : "+ InsertPosition(arr , target));
    }
}
