

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int fact = 1;
          for (int index=number; index >0; index--) {
//              System.out.println(index);
              fact = index*fact;
          }
          return fact;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          char[] phraseChars = phrase.toCharArray();
          String acronym = "";
          for (int index = 0; index < phraseChars.length; index++) {
              if (phraseChars[index] != ' ' && (index == 0 || phraseChars[index - 1] == ' ')) {
                  acronym+=phraseChars[index];
              }
          }
//          System.out.println(acronym);
          return acronym.toUpperCase();
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
          char[] shiftChar = word.toCharArray();
          for (int in = 0; in < shiftChar.length; in++) {
              if (Character.isLetter(shiftChar[in])) {
                  shiftChar[in] = (char) ((shiftChar[in] + 3 - (int)'a') % 26 + (int)'a');
              }
          }
          word = String.valueOf(shiftChar);
          return word;//          String og = "";
      }
}
