package OOP.HW_SortedText;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String story = "    Once upon a time a Wolf was lapping at a spring on a hillside, when, "
                .concat("looking up, what should he see but a Lamb just beginning to drink a little lower down.    ");

        SortedText text = new SortedText(story);

       text.removeAllCommasAndDots();
        text.getAlphabetSortedText();
        System.out.println(Arrays.toString(text.getArrayAllWordFromText()));

    }
}



