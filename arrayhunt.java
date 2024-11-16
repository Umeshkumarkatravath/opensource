import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
            {
            if(a[i]==x)
                c++;
        }
        if(c==0)
            System.out.println("NO");
        else
            System.out.println("YES");

    }
}





