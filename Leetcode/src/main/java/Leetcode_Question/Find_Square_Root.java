package Leetcode_Question;

public class Find_Square_Root {

    static int sqrt(int x){
         int ans = 1;

         int lo = 1;
         int hi = x;

         while (lo <= hi){
              int mid = lo + (hi - lo) / 2;
             long root = (long) mid * mid;

               if(root <= x){
                    ans = mid;
                    lo = mid + 1;
               }
               else {
                   hi = mid - 1;
               }
         }

//          Return the hi also Both Are point the same name ;
         return ans;
    }
    static void main() {
        int squareroot = 2147395599;
        System.out.println("The Closed Square Of the "+squareroot+ " is "+sqrt(squareroot));
    }
}
