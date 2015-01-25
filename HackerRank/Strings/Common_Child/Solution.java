import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        String b =sc.nextLine();
        System.out.println(LCCStr(a,b));
    }
    
    public static int LCCStr(String aa, String bb){
		char a[] = aa.toCharArray();
		char b[] = bb.toCharArray();
		int m = a.length;
		int n = b.length;
		int mat[][] = new int[m][n];
		for(int i=0; i< m; i++){
			for(int j=0;j<n;j++){
				mat[i][j] = 0;
			}
		}
		
		for(int i=0; i< m; i++){
			for(int j=0;j<n;j++){
				int max = (a[i] == b[j])?1:0;
				if(i-1 >= 0){
					max = Math.max(mat[i-1][j], max);
				}
				if(j-1 >= 0){
					max = Math.max(mat[i][j-1], max);
				}
				if(j-1 >= 0 && i-1 >= 0){
					
					if(a[i] == b[j]){
						max = Math.max(mat[i-1][j-1]+1, max);
					}
					else{
						max = Math.max(mat[i-1][j-1], max);
					}
				}
				mat[i][j] = max;
				//System.out.print(" " + mat[i][j]);
			}
			//System.out.println();
		}
		
		
		return mat[m-1][n-1];
	}
}
