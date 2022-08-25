import java.util.*;

import java.io.*;

class CArrayChallenge {

    public static String ArrayChallenge(String[] strArr) {
        // code goes here  
    
        // HashMap<Character, ArrayList<String>> dictionary2 = new HashMap<>();
        
        // dictionary2.put("baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z");
        
        // for (int i = 0; i < strArr.length; i++) {
        //     System.out.println(dictionary2.get(i));
        // }

        // Map<String, String> dictionary = new HashMap<>();
        
        // dictionary.putAll("baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z");
        // strArr = new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
        // String firstElement = new String();
        // firstElement = strArr[0];

        // return firstElement.charAt(4);

        //String[] halfWords = new String[] {strArr[0]};
        ArrayList<Character> charArray1 = new ArrayList<>();   // stores the original word as a character array
        ArrayList<Character> charArray2 = new ArrayList<>();   // stores the original word as a character array
        String[] halfWords = strArr[1].split(",");      // stores all half words
        ArrayList<String> possibleWords1 = new ArrayList<>();  // stores possible half words that may form the original word
        ArrayList<String> possibleWords2 = new ArrayList<>();  // stores possible half words that may form the original word
        String output = new String();                          // stores the final concatenated word
        String finalOutput = new String();                     // stores the final word, with ChallengeToken and _
        String ChallengeToken = "yabj6293";                    // stores the challenge token
            

        //System.out.println("Teste: " + halfWords[1]);

        // StringBuffer palavra1 = new StringBuffer();
        // StringBuffer palavra2 = new StringBuffer();
        //ArrayList<String> halfWords = new ArrayList<>(); 
        
        //halfWords = strArr[1];//.toString().split(",");
        //halfWords.add(strArr[1].split(","));
        // halfWords.toArray();
    
        //System.out.println(halfWords.get(0));

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
                //if ((wordString1.equals(str)) && (wordString2.equals(str))) {
                   // if a half word exists in the halfWords array, adds it
                   // to possibleWords array
                    if (wordString1.equals(str)) {
                        possibleWords1.add(str);
                        //System.out.println(possibleWords1);
                    }
                    if (wordString2.equals(str)) {
                        possibleWords2.add(str);
                        //System.out.println(possibleWords2);
                    }
                
            }
            
            // iterates over the existent half words, attributed to
            // different variables, and compares them, verifying if
            // they form the whole word
            for (String str : possibleWords1) {
                for (String str2 : possibleWords2) {
                    if ((str + str2).equals(strArr[0])) {
                        //if (output.isEmpty()) {
                            output = (str + "," + str2);

                        //}
                        
                    }
                }
            }
            
            
            
            // for (String string : halfWords) {
            //     if (word1 == string);
            // }


            // System.out.println(wordString1);
            // System.out.println(wordString2);


            // criar var com o index1 completo e ir removendo a letra
            // da posiçao do index

            // VER SUBSTRING O QUE É PRA QUE SERVE E COMO USA

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
                    //finalOutput.replace(oldChar, newChar);

                    sb.setCharAt(i, '_');
                    finalOutput = sb.toString();

                    count = 0;
                } else {
                count ++;
                }
            }
        }
        //System.out.println(output);

        // System.out.println(string1.get(3));
        // System.out.println("--------------");
        // String word1 = "";
        // String word2 = "";
        // int i = 0;

        // for (int j = 0; j < halfWords[0].length(); j++) {
        //     word1 = (word1 + halfWords[0].charAt(j));
            

            //for ( int j2 = j+1; j2 < halfWords.length; j2++) {
             //   word2 = (word2 + halfWords[0].charAt(j+1));
            //}
            //if (word1 == )
            // System.out.println("Word1: " + word1);
            // System.out.println("Word2: " + word2);
        // }


        // for (String string : strArr[0]) {
        //     Word1 = (Word1 + string);
        //     System.out.println(Word1.charAt(i));
        //     i += 1;
        // }
        

        return ("Output: " + output + "\n" + 
                "Final Output: " + finalOutput);
    }

    public static void main (String[] args) {
        
        // keep this function call here

        String[] s = new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
        System.out.println(ArrayChallenge(s));

        //Scanner s = new Scanner(System.in);
        
        //System.out.print("Digite a lista de strings: ");
        //System.out.println(ArrayChallenge(s.nextLine().split(",")));
        
        
        
        //String[] halfWords = new String[] {};
        //input = s.nextLine();
        // System.out.println(input);
    
        //halfWords = input.split(",");
        // System.out.println(halfWords[0]);
        //System.out.println(ArrayChallenge(halfWords));

    
        // ArrayChallenge(s); 
      }

}