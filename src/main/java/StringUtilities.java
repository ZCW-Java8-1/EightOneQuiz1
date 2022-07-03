
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
//        return baseValue += valueToBeAdded; -- my original code
        //only better because it uses the concatenate method, it makes the code slightly more clear.
        return baseValue.concat(valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
//        String backwards = "";
//        for (int i = valueToBeReversed.length()-1 ; i >= 0; i--) {
//            backwards += valueToBeReversed.charAt(i);
//        }
//        return backwards;

        //WOW.  LEARN SOME STRINGBUILDER STUFF KYLE

        return new StringBuilder(valueToBeReversed).reverse().toString();

    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
//        int wordLength = word.length();
//        int theMiddle = wordLength / 2;
//        return word.charAt(theMiddle);

        //Wow!  All in one line.  Even better.  If the number of letters, world.length/2 would round UP.

        return word.charAt(word.length()/2);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
//        String remove = Character.toString(charToRemove);
//        value = value.replace(remove, "");
//        return value;

        //Wow!  all in one line!
        //This could also have been done with a for loop and if statement that builds a new string without charToRemove

        return value.replaceAll(String.valueOf(charToRemove), "");
    }



    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] sentenceArray = sentence.split(" ");
        return sentenceArray[sentenceArray.length-1];

        //nailed it!  Kris agrees!
        //he also mentioned this method:
//        ArrayList<String> s = new ArrayList<>(sentence.split(" "));
//        return s.get(s.size()-1)

    }
}
