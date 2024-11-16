import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
           int u[]=new int[n];
            for(int i=0;i<n;i++){
                    u[i]=sc.nextInt();
            }
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
            }
            int sum=0;
            for(int i=0;i<n;i++){
                if (u[i]>=x)
                    sum=sum+a[i];
    }
            System.out.println(sum);
}
    }
}






