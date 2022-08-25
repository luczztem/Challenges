import java.util.*; 
import java.io.*;

/*
1. Word reversal
For this challenge, the input is a string of words, and the output should be 
the words in reverse but with the letters in the original order. 
For example, the string “Dog bites man” should output as “man bites Dog.”

After you’ve solved this challenge, try adding sentence capitalization and 
punctuation to your code. So, the string “Codecademy is the best!” 
should output as “Best the is Codecademy!” 
*/

class CWordReversal {

  public static String WordReversal(String str) {
    // code goes here  
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> newList = new ArrayList<>();



    for (String s : str.split(" ")) {
        list.add(s);
        
    }

    
  
    for (int i = list.size(); i-- > 0; ) {
        newList.add(list.get(i));

    }


    String newString = String.join(",", newList);

    

	  
	  
    return newString;
  }

  public static void main (String[] args) {  
    // keep this function call here     

    String s = ("Dog bites man");
    System.out.print(WordReversal(s)); 
    // Scanner s = new Scanner(System.in);
    // System.out.print(WordReversal(s.nextLine())); 
  }

}