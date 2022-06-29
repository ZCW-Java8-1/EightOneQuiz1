import java.util.Locale;

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int result = 1;
          for (int i = number; i > 0; i--) {
              result *= i;
          }
          return result;
      } //passed

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String result = "";
          for (String s : phrase.split("\\s")) {
              result += s.charAt(0);
          }
          result = result.toUpperCase();
          return result;
      } //passed

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
          char[] ch = word.toCharArray();
          for (int i = 0; i < ch.length; i++) {
              if (ch[i] == 'x') {
                  ch[i] -= 26;
              }
              if (ch[i] == 'y') {
                  ch[i] -= 26;
              }
              if (ch[i] == 'z') {
                  ch[i] -= 26;
              }
              ch[i] += 3;
          }
          String result = new String(ch);
          return result;
      } //passed
}
