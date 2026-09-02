package Leetcode_Question;

public class FindNthRoot {

    static int Root(int mid ,int n , int m){
        int root = 1;

        for(int i = 1; i <= n; i++){
             root *= mid;

             if(root > m) return 2;
        }

        if(root == m) return 1;

        return 0;
    }

    static int NthRoot(int n , int m){
               int lo = 1;
               int hi = m;

               while (lo <= hi){

                   int mid = lo + (hi - lo) / 2;
                   int root = Root(mid , n , m);

                   if(root == 1) return mid;
                   if(root == 0) lo = mid + 1;
                   else hi = mid - 1 ;

               }
               return -1;
    }

    static void main() {

        int n = 3;
        int m = 27;


        System.out.println(NthRoot(n , m));
    }
}
