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
          char[] charArray = new char[word.length()];
          for (int i = 0; i < word.length(); i++) {
              int numberValueOfCurrentChar = java.lang.Character.getNumericValue(word.charAt(i));
              if (numberValueOfCurrentChar >= 33) {
                  int encryptedValue = (word.charAt(i) - 23);
                  charArray[i] = (char) encryptedValue;
              } else {
                  int encryptedValue = (word.charAt(i) + 3);
                  charArray[i] = (char) encryptedValue;
              }
          }
              String encryptedWord = String.valueOf(charArray);
              return encryptedWord;

              //second attempt
//          int[] valueOfChars = new int[word.length()];
//          System.out.println(valueOfChars);
//          for (int i = 0; i < word.length(); i++) {
//              valueOfChars[i] = word.charAt(i) + 3;
//          }
//          System.out.println(valueOfChars);
//          return null;

              //first attempt -_-
//          char[] lettersToChange = new char[word.length()];
//          char currentLetter;
//          for (int i = 0; i <word.length(); i++) {
//              lettersToChange[i] = word.charAt(i);
//          }
//          for (int i = 0; i < word.length(); i++) {
//              currentLetter = lettersToChange[i];
//              currentLetter += 3;
//              lettersToChange[i] = currentLetter;
//          }
//          String encryptedWord = lettersToChange.toString();
//          return encryptedWord;
          }
      }

