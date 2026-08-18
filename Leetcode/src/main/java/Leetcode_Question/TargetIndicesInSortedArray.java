package Leetcode_Question;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndicesInSortedArray {

    static List<Integer>TargetIndices1(int [] arr , int target){
        Arrays.sort(arr);

        List<Integer>ans = new ArrayList<>();

        for(int i = 0 ; i < arr.length; i++){
             if(arr[i] == target) ans.add(i);
        }

        return ans;
    }

    static List<Integer>TargetIndices2(int [] arr , int target){
         int num = 0;
         int cnt = 0;

         for(int ele : arr){
              if(ele == target) cnt++;
              else if(ele < target) num++;
         }


         List<Integer>ans = new ArrayList<>();

         while (cnt > 0){
              ans.add(num);
              num++;
              cnt--;
         }

         return ans;
    }

    static void main() {
       int [] arr = {1,2,5,2,3};
       int target = 5;

       List<Integer>ans = TargetIndices2(arr, target);
        System.out.println(ans);

    }
}
