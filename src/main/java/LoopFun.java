import java.util.Locale;
import java.util.Scanner;

public class LoopFun {

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     *
     * @param number
     * @return the factorial of the number
     */

    // Getting first test to pass, I know I'm on the right track but must move on to other questions
    public Integer factorial(Integer number) {
        int sum = 1;
        for (int i = number; i > 0; i--) {
            sum = sum * i;
            System.out.println(sum);
        }

        return sum;
    }


    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
      public String acronym(String phrase) {
          String[] strList = phrase.split(" ");
          String ans = "";
          for (int i = 0; i <= strList.length -1; i++){
              ans += strList[i].toUpperCase().charAt(0);
          }
              return ans;
      }



      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
//          thinking process LONG VERSION......create string of alphabet
//          split the alphabet string
//          run for loop on "words" String
//          for each character of "words" string compare it to its position in alphabet string + 3
//          return the new element
//          Not really sure how to accomplish this
                String alpha = "abcdefghijklmnopqrstuvwxyz";
                StringBuilder encWord = new StringBuilder();
                for (int i = 0; i < word.length();i ++){
                    int idx = alpha.indexOf(word.charAt(i));
                    idx += 3;
                    idx = idx % 26;
                    encWord.append(alpha.charAt(idx));
                }
                return encWord.toString();

      }
}
