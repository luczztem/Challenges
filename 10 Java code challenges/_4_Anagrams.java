import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

import java.io.*;

/*
4. Anagrams

Two words are anagrams if they contain the same letters but in a different order. Here are a few examples of anagram pairs:

“listen” and “silent”
“binary” and “brainy”
“Paris” and “pairs”
For a given input of two strings, return a Boolean TRUE if the two strings are anagrams.

As an added challenge, for a given array of strings, return separate lists that group anagrams together. 
For example, the input {“tar,” “rat,” “art,” “meats,” “steam”}, the output should look something like {[“tar,” “rat,” “art”], [“meats,” “steam”]}.
*/

class CAnagrams {

  public static String Anagrams(String str, String[] str2) {
    // code goes here  

    
    return stringFoda;
  }

  public static void main (String[] args) {  
    // keep this function call here     

    //String s = ("Dog bites man");
    Scanner scan = new Scanner(System.in);

    System.out.println("Input word: "); 
    String s = scan.nextLine();
    System.out.println("Input phrase: "); 
    String ss = scan.nextLine();
    //Scanner ss = new Scanner(System.in);
    

    System.out.print(Anagrams(s, ss.split(" "))); 
    // System.out.print(WordReversal(s.nextLine())); 
  }

}