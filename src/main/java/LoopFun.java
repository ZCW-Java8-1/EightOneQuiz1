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
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = number *= i;
            sum++;
        }

        return sum;
//          while(int i <= number){
//              number = number * i;
//              i++
//          }
//          return number;
    }

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
//      public String acronym(String phrase) {
//          phrase.split("");
//          for (int i = 0; i <= phrase; i++){
//              System.out.println(i);
//          }

          return null;
}
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
          //Not really sure how to accomplish this
//          String alphaString = "abcdefghijklmnopqrstuvwxyz";
//          alphaString.split("");
//          for( int i = 0; i <= word; i++ )
//              if(int i = a){
//          }




          return null;
      }
}
