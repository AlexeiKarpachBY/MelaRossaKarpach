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
        StringBuilder stringBuilder = new StringBuilder(text.trim());
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ',' | stringBuilder.charAt(i) == '.') {
                stringBuilder.deleteCharAt(i);
            }
        }
        return text = new String(stringBuilder);
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
        Arrays.sort(textArray);
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

        String[] arrayTest = text.trim().split("!");
        for (String k : arrayTest) {
            System.out.println(k);
        }

            return arrayTest;
    }
}
