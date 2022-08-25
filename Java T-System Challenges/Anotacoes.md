String Challenge


Have the function StringChallenge(str) take the str parameter being passed and return it in proper camel case format where the first letter of each word is capitalized (excluding the first letter). The string will only contain letters and some combination of delimiter punctuation characters separating each word.

For example: if str is "BOB loves-coding" then your program should return the string bobLovesCoding.
Once your function is working, take the final output string and concatenate it with your ChallengeToken, and then replace every fourth character with an underscore.


Your ChallengeToken: yabj6293


Examples

Input: "cats AND*Dogs-are Awesome"
Output: catsAndDogsAreAwesome
Final Output: cat_And_ogs_reA_eso_eya_j62_3

Input: "a b c d-e-f%g"
Output: aBCDEFG
Final Output: aBC_EFG_abj_293








Array Challenge

Have the function ArrayChallenge(strArr) read the array of strings stored in strArr, 
which will contain 2 elements: the first element will be a sequence of characters, 
and the second element will be a long string of comma-separated words, in alphabetical order, that represents a dictionary of some arbitrary length. 
For example: strArr can be: ["hellocat", "apple,bat,cat,goodbye,hello,yellow,why"]. 
Your goal is to determine if the first element in the input can be split into two words, 
where both words exist in the dictionary that is provided in the second input. 
In this example, the first element can be split into two words: hello and cat because both of those words are in the dictionary.

Your program should return the two words that exist in the dictionary separated by a comma. So for the example above, your program should return hello,cat. There will only be one correct way to split the first element of characters into two words. If there is no way to split string into two words that exist in the dictionary, return the string not possible. The first element itself will never exist in the dictionary as a real word.
Once your function is working, take the final output string and concatenate it with your ChallengeToken, and then replace every fourth character with an underscore.


Your ChallengeToken: yabj6293


Examples

Input: new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}
Output: base,ball
Final Output: bas_,ba_lya_j62_3


Input: new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"}
Output: abcg,efd
Final Output: abc_,ef_yab_629_


    RESOLUÇÃO PENSADA:

String[] Array = "baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"

String   CharArray = Array[0] ("baseball")

String[] stringList = Array[1] ("a,all,b,ball,bas,base,cat,code,d,e,quit,z")

String   firstWord = 



for (int i = 0; i < CharArray.size(); i++) {
    firstWord.add.charAt(i);
    for i in CharArray:
        firstWord += i
}



Var 1 armazena a string principal
Var 2 armazena o conjunto de caracteres
Word 1 armazena a primeira palavra
Word 2 armazena a segunda palavra, com os restos da primeira



possibleWords1 = b, bas, base
possibleWords2 = ball, all

for (String str : possibleWords1) {
    if (( possibleWords1[] + possibleWords2[] ).equals(strArr[0])) {
        
    }







Math Challenge

Have the function MathChallenge(num1,num2) take both parameters being passed and return the Greatest Common Factor. That is, return the greatest number that evenly goes into both numbers with no remainder. For example: 12 and 16 both are divisible by 1, 2, and 4 so the output should be 4. The range for both parameters will be from 1 to 10^3.

Examples

Input: 7 & num2 = 3
Output: 1

Input: 36 & num2 = 54
Output: 18

    RESOLUÇAO PENSADA

maior1 = maior divisor de num1
maior2 = maior divisor de num2

if (maior1 == maior2)