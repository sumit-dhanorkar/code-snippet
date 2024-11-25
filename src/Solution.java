import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int findLength(int[] x, int[] y, int xC, int yC,int w, int h)
    {
        int length = 1;
        while(xC+length<w && yC+length<h &&xC-length>0 && yC-length>0 )
        {
            if(x[xC+length]==1 && y[yC] == 1)
                break;
            if(x[xC+length]==1 && y[yC+length] == 1)
                break;
            if(x[xC]==1 && y[yC+length] == 1)
                break;
            if(x[xC-length]==1 && y[yC+length] == 1)
                break;
            if(x[xC-length]==1 && y[yC] == 1)
                break;
            if(x[xC-length]==1 && y[yC-length] == 1)
                break;
            if(x[xC]==1 && y[yC-length] == 1)
                break;
            if(x[xC+length]==1 && y[yC-length] == 1)
                break;
            length++;
        }
        return 2*length;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int w,h,n,q;
        Scanner scan = new Scanner(System.in);
        w = scan.nextInt();
        h = scan.nextInt();
        n = scan.nextInt();
        q = scan.nextInt();
        int[] x = new int[w];
        int[] y = new int[h];
        int[] qX = new int[q];
        int[] qY = new int[q];
        for(int i=0;i<w;i++)
            x[i] = 0;
        for(int i=0;i<h;i++)
            y[i] = 0;
        for(int i=0;i<n;i++)
        {
            int xC = scan.nextInt();
            int yC = scan.nextInt();
            x[xC] = 1;
            y[yC] = 1;
            //x[i] = scan.nextInt();
            //y[i] = scan.nextInt();
        }
        for(int i=0;i<q;i++)
        {
            qX[i] = scan.nextInt();
            qY[i] = scan.nextInt();
        }
        
        for(int i=0;i<q;i++)
        {
            System.out.println(findLength(x,y,qX[i],qY[i],w,h));
        }
        
    }
}