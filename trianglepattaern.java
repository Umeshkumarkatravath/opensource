MONDAY






1
7:58 pm






TUESDAY



Hi
8:12 pm











8:15 pm






TODAY




Forwarded



Shared via PowerPoint on Android.
12:52 pm









Forwarded

HackerRank
**ElevateBox Preliminary** Pratice Problems
www.hackerrank.com
Good evening students, This is the updated lis. 

Register here and start solving :https://www.hackerrank.com/contests/elevatebox-preliminary/

( these scores will be updated in the website as well)
7:58 pm









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
8:25 pm





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
8:26 pm





HackerRank
Join over 11 million developers in solving code challenges on HackerRank, one of the best ways to prepare for programming interviews.
www.hackerrank.com
https://www.hackerrank.com/contests/elevatebox-preliminary/challenges/score-passing-marks/submissions/code/1385478999
8:28 pm






import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        }
        int r[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                r[i]+=a[i][j];
                c[j]+=a[i][j];
            }
           
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++)
            res[i]=r[i]+c[i];
        for(int i=0;i<n;i++)
            System.out.print(res[i]+" ");
    }
}
8:36 pm





import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int i=sc.nextInt();
         boolean isSet = (n & (1L << (i - 1))) != 0;
                System.out.println(isSet ? "true" : "false");

}
}
8:38 pm






import java.io.*;
import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int N=x*2;
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < N / 2 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < N / 2 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < N - 2 * (i + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
