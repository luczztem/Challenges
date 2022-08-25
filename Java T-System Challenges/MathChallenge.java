import java.util.*; 
import java.io.*;

class Main1 {

    public static String MathChallenge(int num1, int num2) {
        // code goes here  


        int biggestFactor1 = 0;
        int biggestFactor2 = 0;
        int biggestCommon = 0;



        // iterates from 1 to range 10^3 (1 to 1000)
        for (int i = 1; i < (Math.pow(10,3)); i++) {
            
            // checks if the rest of num1 divised by i equals 0
            if ((num1 % i) == 0) {

                // if i is bigger than the last biggest factor, defines i as the biggest factor
                if (i > biggestFactor1) {
                    biggestFactor1 = i;
                }
            }

            // checks if the rest of num2 divided by i equals 0
            if ((num2 % i) == 0) {

                // if i is bigger than the last biggest factor, defines i as the biggest factor
                if (i > biggestFactor2) {
                    biggestFactor2 = i;
                }
            }
            // checks if both factors are common, then register it in var biggestCommon
            if (biggestFactor1 == biggestFactor2) {
                biggestCommon = biggestFactor1;
            }
        
        }



        return ("Maior comum: " + biggestCommon);
    }

    public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        
        //System.out.print(MathChallenge(s.nextLine())); 
        
        // Integer.parseInt() converts a String to Integer.
        System.out.println(MathChallenge(Integer.parseInt(s.nextLine()), 
                                         Integer.parseInt(ss.nextLine())));
       
    }

}