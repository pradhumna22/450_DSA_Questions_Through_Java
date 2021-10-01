//leetcode
//Reverse a String

class Solution {
    public void reverseString(char[] s) {
         char [] string1=new char[s.length];
      string1=s;
        int c=s.length-1;
        for(int i=0;i<s.length;i++){
            s[i]=string1[c];
                c--;
    }
}
}
