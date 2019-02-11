
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
        String bloop = baseValue + valueToBeAdded;
        return bloop;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String result = "";
        for (int i = 0; i < valueToBeReversed.length(); i++) {
            result = valueToBeReversed.charAt(i) + result; }
        return result;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int length = word.length();
        int middle = length / 2;
        char middleChar;
        if (length % 2 == 0) {
            middleChar = word.charAt(middle - 1);
        } else {
            middleChar = word.charAt(middle);
        }
        return middleChar;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {

        int j = 0;
        int k = value.length();
        int count = 0;
        char []l = value.toCharArray();

        for (int i = j = 0; i < k; i++){
            if (l[i] != charToRemove)
                l[j++] = l[i];
            else
                count++;
        }
        while (count > 0)
        {
            l[j++] = '\0';
            count--;
        } 

        return String.valueOf(l);

    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);
        return lastWord;
    }
}
