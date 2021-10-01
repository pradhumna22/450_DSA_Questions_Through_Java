//Programiz
//Write a Program to check whether a string is a valid shuffle of two strings or not

import java.util.Arrays;

class Test {


  // length of result string should be equal to sum of two strings
  static boolean checkLength(String first1, String second2, String result) {
    if (first1.length() + second2.length() != result.length()) {
      return false;
    }
    else {
      return true;
    }
  }

  // this method converts the string to char array 
  // sorts the char array
  // convert the char array to string and return it
  static String sortString(String str) {
  
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);

    // convert char array back to string
    str = String.valueOf(charArray);

    return str;
  }

  // this method compares each character of the result with 
  // individual characters of the first and second string
  static boolean shuffleCheck(String first1, String second2, String result) {
    
    // sort each string to make comparison easier
    first1 = sortString(first);
    second2 = sortString(second);
    result = sortString(result);

    // variables to track each character of 3 strings
    int i = 0, j = 0, k = 0;

    // iterate through all characters of result
    while (k != result.length()) {

      // check if first character of result matches
      // with first character of first string
      if (i < first.length() && first1.charAt(i) == result.charAt(k))
        i++;

      // check if first character of result matches
      // with the first character of second string
      else if (j < second2.length() && second2.charAt(j) == result.charAt(k))
        j++;

      // if the character doesn't match
      else {
        return false;
      }

      // access next character of result
      k++;
    }

    // after accessing all characters of result
    // if either first or second has some characters left
    if(i < first1.length() || j < second2.length()) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {

    String first1 = "XY";
    String second2 = "12";
    String[] results = {"1XY2", "Y1X2", "Y21XX"};

    // call the method to check if result string is
    // shuffle of the string first and second
    for (String result : results) {
      if (checkLength(first1, second2, result) == true && shuffleCheck(first1, second2, result) == true) {
        System.out.println(result + " is a valid shuffle of " + first1 + " and " + second2);
      }
      else {
        System.out.println(result + " is not a valid shuffle of " + first1 + " and " + second2);
      }
    }
  }
}
