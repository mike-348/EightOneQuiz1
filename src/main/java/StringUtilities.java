public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    } //passed

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String result = baseValue.concat(valueToBeAdded);
        return result;
    } //passed

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder sb = new StringBuilder();
        for(int i=valueToBeReversed.length()-1;i>=0;i--) {
            sb.append(valueToBeReversed.charAt(i));
        }
        String result = sb.toString();
        return result;
    } //passed

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int length = word.length();
        int middle = length / 2;
        return word.charAt(middle);
    } //passed

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String str = value.replace(charToRemove.toString(),"");
        return str;
    } //passed

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] strArr = sentence.split("\\s");
        String result = strArr[strArr.length-1];
        return result;
    } //passed
}
