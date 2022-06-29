import java.util.Arrays;

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer factorialResult = 1;
          for (int i = 1; i <= number; i++) {
              factorialResult = factorialResult * i;
          }
          return   factorialResult;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          StringBuilder acronym = new StringBuilder();
          String input = phrase;
          input = input.toUpperCase();
          String[] phraseArray = input.split(" ");
          for (int i = 0; i < phraseArray.length; i++) {
              acronym.append(phraseArray[i].charAt(0));
          }
          String result = acronym.toString();
          return result;
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
          char[] lettersToChange = new char[word.length()];
          char currentLetter;
          for (int i = 0; i <word.length(); i++) {
              lettersToChange[i] = word.charAt(i);
          }
          for (int i = 0; i < word.length(); i++) {
              currentLetter = lettersToChange[i];
              currentLetter += 3;
              lettersToChange[i] = currentLetter;
          }
          String encryptedWord = lettersToChange.toString();
          return encryptedWord;
      }
}
