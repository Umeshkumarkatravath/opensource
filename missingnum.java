import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int r=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]!=i){
                r=i;
                break;
            }
            
        }
        if(r==0)
                System.out.println(n);
            else
                System.out.println(r);
    }
}
8:41 pm





