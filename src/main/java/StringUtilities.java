
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
        return baseValue += valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
//        int sizeOfArray = value.length;
//        String[] reversal = new String[sizeOfArray];
//        int y = 0;
//        for (int z = array.length-1 ; z >= 0 ; z--) {
//            reversal[y] = array[z];
//            y++;

        String backwards = "";
        for (int i = valueToBeReversed.length()-1 ; i >= 0; i--) {
            backwards += valueToBeReversed.charAt(i);
        }
        return backwards;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int wordLength = word.length();
        int theMiddle = wordLength / 2;
        return word.charAt(theMiddle);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String remove = Character.toString(charToRemove);
        value = value.replace(remove, "");
        return value;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] sentenceArray = sentence.split(" ");
        return sentenceArray[sentenceArray.length-1];
    }
}
