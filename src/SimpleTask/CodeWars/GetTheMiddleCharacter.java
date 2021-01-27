package SimpleTask.CodeWars;

public class GetTheMiddleCharacter {
    /*You are going to be given a word. Your job is to return the middle character of the word. If the word's
    length is odd, return the middle character. If the word's length is even, return the middle 2 characters.*/

    public static void main(String[] args) {

        System.out.println(getMiddle("a"));

    }

    public static String getMiddle(String word) {
        String s = new String();
        if (word.length() == 1) {
            s = word;
            return s;
        }
        if (word.length() % 2 == 0) {
            s = String.valueOf(word.charAt((word.length() / 2) - 1)) + String.valueOf(word.charAt(word.length() / 2));
        } else {
            s = String.valueOf(word.charAt(word.length() / 2));
        }

        return s;
    }
}
