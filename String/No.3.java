//GFG
//Find Duplicate characters in a string

public class GFG {
    static final int NO_OF_CHARS = 256;
 
    /* Fills count array with
       frequency of characters */
    static void fillCharCounts(String str,
                                   int[] count)
    {
        for (int j = 0; j < str.length(); j++)
            count[str.charAt(j)]++;
    }
 
    /* Print duplicates present
      in the passed string */
    static void printDups(String str)
    {
        // Create an array of size
        // 256 and fill count of
        // every character in it
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str, count);
 
        for (int j = 0; j < NO_OF_CHARS; j++)
            if (count[j] > 1)
                System.out.println((char)(j) +
                          ", count = " + count[j]);
    }
 
    // Driver Method
    public static void main(String[] args)
    {
        String str = "test string";
        printDups(str);
    }
}
