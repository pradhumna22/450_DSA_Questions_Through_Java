//GFG
//Check whether a String is Palindrome or not


//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPlaindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPlaindrome(String S) {
        String w="";
        int l=S.length()-1;
        
        while(l>=0){
            char ch=S.charAt(l);
            w=w+ch;
            l--;
        }
        if(S.equals(w)){
            return 1;
        }
        else
        {
            return 0;
        }
    }
};