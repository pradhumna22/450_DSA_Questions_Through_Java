//leetcode
//Reverse a String

class Solution {
    public void reverseString(char[] s) {
         char [] s1=new char[s.length];
      s1=s;
        int c=s.length-1;
        for(int i=0;i<s.length;i++){
            s[i]=s1[c];
                c--;
    }
}
}