import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int ar[]=new int[2];
        boolean exist[]=new boolean[n+1];
        for(int i=0;i<arr.size();i++){
            if(exist[arr.get(i)]){
                ar[1]=arr.get(i);
            }
            exist[arr.get(i)]=true;
        }
        for(int i=1;i<=n;i++){
            if(exist[i]==false){
                ar[0]=i;
            }
        }
        return ar;
    }
}
