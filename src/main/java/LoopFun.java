 

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
              result = result * i;
          }
          return result;

//          if (number==0)
//              return 1;
//          else {
//              return (number * factorial(number-1));
//          }
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {

//          String str = phrase.replaceAll("\\B.|\\P{L}", "").toUpperCase();
//          return str;

          String variable = "";
          String[] a = phrase.split(" "); // hello my name > [hello, my, name]
          for (int i=0; i<a.length; i++){
              variable = variable + a[i].charAt(0);
          }
          variable = variable.toUpperCase();
          return variable;

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
          char[] chars = word.toCharArray();
          String result = "";
          for (int i = 0; i < chars.length; i++) {
              if(chars[i] <= 'w') {
                  result += chars[i] += 3;
              } else if (chars[i] >= 'x') {
                  result += chars[i] -= 23;
              }
          }

          return result;
      }
}
