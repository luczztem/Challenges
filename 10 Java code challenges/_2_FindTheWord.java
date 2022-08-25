import java.util.*; 
import java.io.*;

/*
2. Find the word

Starting with an input string of words, find the second-to-last word of the string. 
For example, an input of “I love Codecademy” should return “love.”

To make your program more challenging, allow for a second numerical input, n, 
that results in returning the nth word of a string. So, for the string 
“I can program in Java” and n = 3, the output should be the third word, “program.”
*/

class CFindTheWord {

  public static String FindTheWord(String str, Integer n) {
    // code goes here  
    
    ArrayList<String> stringArray = new ArrayList<>();

    for (String s : str.split(" ")) {
        stringArray.add(s);
        
    }




	                    // strngArray.size() - 1 ----- simboliza o último valor do array;
    return stringArray.get(stringArray.size() - n).toString() + n;
  }

  public static void main (String[] args) {  
    // keep this function call here     

    //String s = ("Dog bites man");
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a palavra: "); 
    String s = scan.nextLine();
    //Scanner ss = new Scanner(System.in);
    System.out.print("Numero da n° ultima palavra: "); 
    int ss = scan.nextInt();

    System.out.print(FindTheWord(s, ss)); 
    // System.out.print(WordReversal(s.nextLine())); 
  }

}