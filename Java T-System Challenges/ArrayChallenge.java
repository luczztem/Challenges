import java.util.*;

import java.io.*;

class Main {

    public static String ArrayChallenge(String[] strArr) {
        // code goes here  
    
        ArrayList<Character> charArray1 = new ArrayList<>();   // stores the original word as a character array
        ArrayList<Character> charArray2 = new ArrayList<>();   // stores the original word as a character array
        String[] halfWords = strArr[1].split(",");      // stores all half words
        ArrayList<String> possibleWords1 = new ArrayList<>();  // stores possible half words that may form the original word
        ArrayList<String> possibleWords2 = new ArrayList<>();  // stores possible half words that may form the original word
        String output = new String();                          // stores the final concatenated word
        String finalOutput = new String();                     // stores the final word, with ChallengeToken and _
        String ChallengeToken = "yabj6293";                    // stores the challenge token
            


        // stores strArr[0] in charArray2 as a character array
        for (int i = 0; i < strArr[0].length(); i++) {
            charArray2.add(strArr[0].charAt(i));
        }

        // this for iterates strArr[0] (baseball), dividing it in half,
        // each half being inside a charArray variable 
        for (int i = 0; i < strArr[0].length(); i++) {
            String wordString1 = new String();
            String wordString2 = new String();
            charArray1.add(strArr[0].charAt(i));
            charArray2.remove(0);


            // converts the array of characters to a String;
            // **could be made into a function**
            for (char str : charArray1) {
                wordString1 += str;
            }
            for (char str : charArray2) {
                wordString2 += str;
            }
            
            
            // this for iterates strArr[1] (a,all,b,ball,bas,base,cat,code,d,e,quit,z)
            for (String str : halfWords) {
                // if a half word exists in the halfWords array, adds it to possibleWords array
                if (wordString1.equals(str)) {
                    possibleWords1.add(str);
                }
                if (wordString2.equals(str)) {
                    possibleWords2.add(str);
                }
            }
            
            // iterates over the existent half words, attributed to different
            // variables, and compares them, verifying if they form the whole word
            for (String str : possibleWords1) {
                for (String str2 : possibleWords2) {
                    if ((str + str2).equals(strArr[0])) {
                        output = (str + "," + str2);
                    }
                }
            }
            
            
        }

        if (output.isEmpty()) {
            output = "not possible";
            finalOutput = "not possible";
        } else {
            // adds ChallengeToken to the stringList;
            finalOutput = output + ChallengeToken;
            
            // substitutes every fourth character with a underscore(_);
            StringBuilder sb = new StringBuilder(finalOutput);
            int count = 0;
            for (int i = 0; i < finalOutput.length(); i++) {
                if (count == 3) {

                    sb.setCharAt(i, '_');
                    finalOutput = sb.toString();

                    count = 0;
                } else {
                count ++;
                }
            }
        }
        
                

        return ("Output: " + output + "\n" + 
                "Final Output: " + finalOutput);
    }

    public static void main (String[] args) {
        
        // keep this function call here

        String[] s = new String[] {"hhhhabcgefhd", "a,ab,abc,acg,b,c,dog,e,fd,zzzz"};
        System.out.println(ArrayChallenge(s));

      }

}