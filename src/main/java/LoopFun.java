 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int y = 1;
          for (int x = 2; x <= number; x++) {
              y = y * x;
          }
          return y;

          // the factorial function can only go up to the number 13.
          // \/\/ using ternary operators. kris didn't like it much
//          return (number == 1) || (number == 0) ? 1 : number * factorial(number - 1);

      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
//          String[] phraseArray = phrase.split(" ");
//          String acronym = "";
//          for (int i = 0 ; i <= phraseArray.length-1 ; i++) {
//              acronym += phraseArray[i].charAt(0);
//          }
//          acronym = acronym.toUpperCase();
//          return acronym;

          String[] sentence = phrase.split(" ");
          String result = "";
          for (String s : sentence) {
              result = result + s.charAt(0);
          }
          return result.toUpperCase();

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
//          String alphabet = "abcdefghijklmnopqrstuvwxyz";
//          String secretWord = "";
//          for (int wloop = 0 ; wloop < word.length() ; wloop++) {
//              for (int aloop = 0 ; aloop < alphabet.length() ; aloop++)
//              if (word.charAt(wloop) == alphabet.charAt(aloop)) {
//                  if (aloop+3 >= 26) {
//                      secretWord += alphabet.charAt(aloop-23);
//                  } else {secretWord+=alphabet.charAt(aloop+3);}
//              }
//          }
//          return secretWord;
//      }
          String alphabet = "abcdefghijklmnopqrstuvwxyz";
          StringBuilder encword = new StringBuilder();
          for (int i = 0; i < word.length(); i++) {
              int index = alphabet.indexOf(word.charAt(i));
              index += 3;
              index = index % 26;
              encword.append(alphabet.charAt(index));
          }
          return encword.toString();
      }

          //MOD WORKS HERE ON LINE 80 BECAUSE IT WILL LOOP FROM 0 TO 26.  IF THE NUMBER WOULD GO OVER 26
          //IT WILL LOOP BACK TO 0.  CREATIVE WAY TO LOOP BACK AROUND TO THE BEGINNING OF THE ALPHABET.
}
