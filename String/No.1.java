//leetcode
//Reverse a String

class Solution {
    public void reverseString(char[] string) {
         char [] string1=new char[string.length];
      string1=string;
        int c=string.length-1;
        for(int i=0;i<string.length;i++){
            string[i]=string1[c];
                c--;
    }
}
}
