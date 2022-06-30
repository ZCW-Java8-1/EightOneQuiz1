
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

        return (baseValue + valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String results = "";

        for (int i = valueToBeReversed.length() - 1; i >= 0; i--){
            results = results + valueToBeReversed.charAt(i);

        }
        return results;

    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */

//    I know im close, still a beginner and trying to figure it all out, had to comment out "getMiddlechar" to run other test
    public Character getMiddleCharacter(String word) {
        return word.charAt(word.length() / 2);

    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
            String s = value.replaceAll(String.valueOf(charToRemove), "");

        return s;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] word = sentence.split(" ");
        return word[word.length - 1];

    }

}
