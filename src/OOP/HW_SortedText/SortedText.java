package OOP.HW_SortedText;

import java.util.Arrays;

public class SortedText {

    String text;

    public SortedText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String removeAllCommasAndDots() {
        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ',' | stringBuilder.charAt(i) == '.') {
                stringBuilder.deleteCharAt(i);
            }
        }
        return text = new String(stringBuilder);
    }

    public String sortByCapitalLetter() {
        String[] array = text.toLowerCase().split(" ");
        String temp;
        for (int a = 1; a < array.length; a++)
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1].charAt(0) > array[b].charAt(0)) {
                    temp = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = temp;
                }
            }
        text = Arrays.toString(array);
        return text;
    }

    public String[] createArrayWithAlphabet() {
        String[] alpArray = new String[26];

        char k = 'A';
        for (int i = 0; i < alpArray.length; i++) {
            alpArray[i] = k + ": ";
            k++;
        }
        return alpArray;
    }

    public String getAlphabetSortedText() {
        String[] alpArray = createArrayWithAlphabet();
        String[] textArray = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String x : alpArray) {
            result.append("!").append(x);
            for (String s : textArray) {
                if (x.toLowerCase().charAt(0) == s.toLowerCase().charAt(0)) {
                    result.append(s).append(" ");
                }
            }
        }
        text = new String(result);
        return text;
    }

    public String[] getArrayAllWordFromText() {
        String[] arrayTest = getText().split("!");
        int count = 0;
        for (String k : arrayTest) {
            if (k.length() > 3) count++;
        }

        String[] test = new String[count];
        int i = 0;
        for (String x : arrayTest) {
            if (x.length() > 3) {
                test[i] = x;
                i++;
            }
        }
        return test;
    }
}
