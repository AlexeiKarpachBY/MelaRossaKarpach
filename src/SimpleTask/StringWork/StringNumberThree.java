package SimpleTask.StringWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringNumberThree {

    /*String str = "Я кушал 8 раз";
    System.out.println(replaceNumbersWithWords(str));*/

    public static StringBuilder replaceNumbersWithWords(String str) {
        String[] arrayWords = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        StringBuilder testSb = new StringBuilder(str);


        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(testSb);
        String[] desiredArray = new String[3];

        int j = 0;
        while (matcher.find()) {
            desiredArray[j] = testSb.substring(matcher.start(), matcher.end());
            j++;
        }

        Matcher matcher1 = pattern.matcher(testSb);
        int k =0;
        while (matcher1.find()) {
            testSb.replace(matcher1.start(), matcher1.end(), arrayWords[Integer.valueOf(desiredArray[k])]);
        }


        return testSb;


    }
}
