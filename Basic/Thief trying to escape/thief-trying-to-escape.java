//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int X = Integer.parseInt(a[0]);
            int Y = Integer.parseInt(a[1]);
            int N = Integer.parseInt(a[2]);
            String a1[] = in.readLine().trim().split("\\s+");
            int[] arr = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.totalJumps(X, Y, N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int totalJumps(int X, int Y, int N, int arr[])
    {
        // code here
        int jumps=0;
        for(int height:arr){
            int climb=0;
            if(height<=X){
                jumps++; continue;
            }
            while(climb<height){
                climb+=X; if(climb>=height){
                    jumps++;continue;
                }
                climb-=Y;
                jumps++;
            }
        }
        return jumps;
        
    }
}