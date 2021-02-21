package SimpleTask.CodeWars;

import java.util.Arrays;

public class MexicanWave {
    public static void main(String[] args) {
        String word1 = "two words";
        String word2 = "codewars";
        String word3 = " gap ";
        String word4 = "hello";

         System.out.println(Arrays.toString(wave(word1)));
        System.out.println(Arrays.toString(wave(word2)));
         System.out.println(Arrays.toString(wave(word3)));
         System.out.println(Arrays.toString(wave(word4)));

    }

    public static String[] wave(String str) {
        String word = str.trim();
        int count = 0;
        String[] result = new String[word.length()];
        do {
            char[] charArray = word.toCharArray();
            String arrayWord = "";
            for (int i = 0; i < charArray.length; i++) {
                int temp = count;
                if (charArray[i] == ' ') {
                    temp++;
                }
                if (i == temp) {
                    arrayWord = arrayWord.concat(String.valueOf(charArray[i]).toUpperCase());
                }
                if (i != temp) {
                    arrayWord = arrayWord.concat(String.valueOf(charArray[i]));
                }
                result[count] = arrayWord;
            }
            count++;

        } while (count < word.length());
        return result;
    }
}

