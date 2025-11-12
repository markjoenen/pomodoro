package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWord("I love Test Automation University");

    }

    /**
     * Splits a String into an Array bu tokenizing it.
     * Count words and prints them
     * @param text Full string to be split
     */
    public static void countWord(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        
    }
}
