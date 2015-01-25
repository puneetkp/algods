import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void solveArr(int[] arr){
//        System.out.println("10 10");
        boolean allNeg = true;
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i< arr.length; i++){
            if(max < arr[0]){ max = arr[0];}
            if(arr[i] > 0) {
                allNeg = false;
                break;
            }

        }
        
        if(allNeg){
            System.out.println(max + " " + max);
            return;
        }
        max = 0;
        int curr = 0;
        int maxp = 0;
        for(int i =0 ; i< arr.length; i++){
            if(arr[i] >0 ) { maxp += arr[i];}
            curr += arr[i];
            if(curr < 0) { curr = 0;}
            if(curr > max){ max = curr;}
        }
        System.out.println(max + " " + maxp);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //System.out.println("10 10");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i= 0; i<N; i++){
            int ne = in.nextInt();
            int arr[] = new int[ne];
            for(int j=0; j<ne; j++){
                arr[j] =  in.nextInt();
            }
            solveArr(arr);
        }
        
    }
}
