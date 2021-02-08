package SimpleTask.CodeWars;

       /* Your task is to sort a given string.Each word in the string will contain a single number.
        This number is the position the word should have in the result.
        Note:Numbers can be from 1to 9.So 1will be the first word(not 0).
        If the input string is empty,return an empty string.The words in the input
        String will only contain valid consecutive numbers.*/

/*"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"*/

import java.util.Arrays;

public class YourOrderPlease {

    public static void main(String[] args) {

        String word1 = "is2 Thi1s T4est 3a";
        String word2 = "";
        String word3 = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(order(word3));
    }

    public static String order(String words) {
        String result = "";

        if (words.equals("")) {
            result = "";
        } else {
            String[] array = words.split(" ");
            String[] stringsArray = new String[array.length];
            for (String k : array) {
                char[] charsArray = k.toCharArray();
                for (char j : charsArray) {
                    if (j == '1') {
                        stringsArray[0] = k;
                    }
                    if (j == '2') {
                        stringsArray[1] = k;
                    }
                    if (j == '3') {
                        stringsArray[2] = k;
                    }
                    if (j == '4') {
                        stringsArray[3] = k;
                    }
                    if (j == '5') {
                        stringsArray[4] = k;
                    }
                    if (j == '6') {
                        stringsArray[5] = k;
                    }
                    if (j == '7') {
                        stringsArray[6] = k;
                    }
                    if (j == '8') {
                        stringsArray[7] = k;
                    }
                    if (j == '9') {
                        stringsArray[8] = k;
                    }
                }
            }
            for (String j : stringsArray) {
                result = result.concat(j).concat(" ");
            }
        }
        return result.trim();
    }

}

