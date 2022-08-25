import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

import java.io.*;

/*
3. Word search

For a given input string, return a Boolean TRUE if the string starts with a given input word. 
So, for an input string of “hello world” and input word “hello,” the program should return TRUE.

For a more advanced word searcher, create a program that returns the number of times a word appears 
in an input string. For example, given an input word “new” and an input string “I'm the new newt,” the program should return a value of 2.
*/

class CWordSearch {

  public static String WordSearch(String str, String[] str2) {
    // code goes here  

    String stringFoda = "";
    ArrayList<Integer> indices = new ArrayList<>();

    int y = str2.length - 1;
    
    for (int i = 0; i < str2.length; i++) {
        y -= 1;

        if ( !(y == 0) ){

            if (str2[i].contains(str)) {
                //System.out.println("molinha" + i);
                indices.add(i);
                stringFoda = ("A palavra " + str + " repete nos índices: ");
                for (int n : indices) {
                    
                    stringFoda += ( n + ", " );
                    
                }
            } else {
                stringFoda = ("False");
            }
        } else {
            if (str2[i].contains(str)) {
                //System.out.println("molinha" + i);
                indices.add(i);
                stringFoda = ("A palavra " + str + " repete nos índices: ");
                for (int n : indices) {
                    
                    stringFoda += ( n + "." );
                    
                }
            }
        }
    }

    
    
    //return str + Arrays.toString(str2);
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
    

    System.out.print(WordSearch(s, ss.split(" "))); 
    // System.out.print(WordReversal(s.nextLine())); 
  }

}