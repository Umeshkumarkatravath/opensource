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
