
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
        String concatenatedString = baseValue + valueToBeAdded;
        return concatenatedString;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder reverser = new StringBuilder();
        for (int i = valueToBeReversed.length() -1; i >= 0; i--) {
            reverser.append(valueToBeReversed.charAt(i));
        }
        String result = reverser.toString();
        return result;

        // return new StringBuilder(valueToBeReversed).reverse().toString();  // a one line solution.
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        if (word.length() % 2 == 0) {
            throw new IllegalArgumentException("Word must contain odd number of letters");
        }
        int characterIndexToRetrieve = word.length() / 2;
        Character result = word.charAt(characterIndexToRetrieve);
        return result;

        //return word.charAt(word.length()/2); // one line solution that does the same thing.
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return value.replaceAll(charToRemove.toString(), "");
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {

        //code directly below would extract all non letters and keep sentence structure w/ spaces. That way our last 'word' doesn't include punctuation.
//       String updatedSentence = "";
//       for (int i = 0; i < sentence.length(); i++) {
//           if (Character.isLetter(sentence.charAt(i)) || Character.isSpaceChar(sentence.charAt(i))) {
//               updatedSentence = updatedSentence + sentence.charAt((i));
//           }
//       }
//        System.out.println(updatedSentence);
        //this works but I don't like it. It meets the test cases, but still includes punctuation. may update method & test cases.
        String[] input = sentence.split(" ");
        return input[input.length -1];

        //or
        //ArrayList<String> inputSentence = new ArrayList<>(sentence.split(""));
        //return inputSentence.get(inputSentence.size()-1;

//        or
        //could have also used a variable to spot the last space, store that index position. then use that with input.substring();
    }
}
