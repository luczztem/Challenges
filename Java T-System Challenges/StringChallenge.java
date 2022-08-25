import java.util.*; 
import java.io.*;

class GayArray {

  public static String StringChallenge(String str) {
    // code goes here  

    ArrayList<Character> stringList = new ArrayList<Character>();
    String ChallengeToken = "yabj6293";
    int count = 0; 
    str = str.trim();
    int notLetter = 0;
    boolean letterVerifier = false;


    // this for goes through the whole string ;
    for (int i = 0; i < str.length(); i++) {
       
        // checks if the character at index i is a letter;
        if ( Character.isLetter(str.charAt(i)) ) {
            letterVerifier = true;
            // sums notLetter to index, skipping non-letter characters;
            if (i > (0 + notLetter)) {  
                // if anterior index is not a letter, sets
                // current index to Upper Case;
                if ( !Character.isLetter(str.charAt(i-1)) ) {
                stringList.add(str.toUpperCase().charAt(i));
                } else {
                // if anterior index is a letter, sets
                // current index to Lower Case;
                stringList.add(str.toLowerCase().charAt(i));
                }

            } else {
                // sets first index to Lower Case
                stringList.add(str.toLowerCase().charAt(i));
            }   
        
        } else {
            if (letterVerifier == false) {
                // counter of non-letter characters that may be in the string "str";
                notLetter += 1;
            }
        }
      
    }


    // puts all characters from stringList to string var output;
    String output = "";
    for (int i = 0; i < stringList.size(); i++) {
        output += stringList.get(i);
    }



    // adds ChallengeToken to the stringList;
    for (int i = 0; i < ChallengeToken.length(); i++) {
        stringList.add(ChallengeToken.charAt(i));
    }



    // substitutes every fourth character with a underscore(_);
    for (int i = 0; i < stringList.size(); i++) {
        if (count == 3) {
        stringList.set(i, '_');
        count = 0;
        } else {
        count ++;
        }
    }

    // puts all characters from stringList to string finalOutput;
    String finalOutput = "";
    for (int i = 0; i < stringList.size(); i++) {
        finalOutput += stringList.get(i);
    }
   

    //return stringList.toString();
    return ("Input: " + str + "\n" +
            "Output: " + output + "\n" + 
            "Final Output: " + finalOutput);
  }






  public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine())); 
  }

}