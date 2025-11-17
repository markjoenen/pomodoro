package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWord("I love Test Automation University");
        reverseString("Hello RWP");
        addSpaces("HeyThere!DoYouWannaRun?");
    }

    /**
     * Splits a String into an Array by tokenizing it.
     * Count words and prints them
     * @param text Full string to be split
     */
    public static void countWord(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (String word : words){
            System.out.println(word);
        }
    }

    /**
     * Prints String in reversed order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for(int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.println("");
    }

    /**
     * Add spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

//        System.out.println(String.format("%s", Integer.toString(1233)));

        for (int i = 0; i < modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.print(modifiedText);
        System.out.println("");
    }
}
