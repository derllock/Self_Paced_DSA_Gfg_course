//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        // code here
        String noDuplicate="";
        Set<Character>original=new LinkedHashSet<Character>();
        for(char c:str.toCharArray()){
            original.add(c);
        }
        
        for(char c: original){
            noDuplicate+=String.valueOf(c);
        }
        return noDuplicate;
        
    }
}

