package OOP.HW_SortedText;

import java.util.Arrays;
import java.util.Locale;

public class SortedText {

    String text;

    public SortedText(String text) {
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String sortText() {

        removeAllCommasAndDots();
        getAlphabetSortedText();
        getArrayAllWordFromText();
        removeCounters();

        return text;
    }

    private void removeAllCommasAndDots() {
        StringBuilder stringBuilder = new StringBuilder(text.trim());

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ',' | stringBuilder.charAt(i) == '.') {
                stringBuilder.deleteCharAt(i);
            }
        }
        text = new String(stringBuilder).trim();

    }
    private void removeCounters() {
        StringBuilder stringBuilder = new StringBuilder(text.trim());
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '1') {
                stringBuilder.deleteCharAt(i);
            }
        }
        text = new String(stringBuilder);
    }
    private void getAlphabetSortedText() {
        String[] alpArray = createArrayWithAlphabet();
        String[] textArray = text.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();
        Arrays.sort(textArray);


        for (String x : alpArray) {
            result.append(x);
            for (String s : textArray) {
                System.out.println(s);
                if (x.toLowerCase().charAt(0) == s.toLowerCase().charAt(0)) {
                    result.append(s).append(" ");
                }
            }
        }
        text = new String(result);
    }
    private void getArrayAllWordFromText() {
        String[] arrayTest = text.trim().split(" ");


        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < arrayTest.length; i++) {

            if (arrayTest[i - 1].equals(arrayTest[i])) {
                count++;
            } else {
                stringBuilder.append(arrayTest[i - 1])
                        .append(" ")
                        .append(count)
                        .append("\n");
                count = 1;
            }
        }

        text = new String(stringBuilder);
    }

    private String[] createArrayWithAlphabet() {
        String[] alpArray = new String[26];

        char k = 'A';
        for (int i = 0; i < alpArray.length; i++) {
            alpArray[i] = k + ": ";
            k++;
        }
        return alpArray;
    }
}
