package SimpleTask.StringWork;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringNumberTwo {

    /*String [] test = {"qqqqqqqq","tttt","bb","fff","wwwwwww","a","eeeeee","rrrrr"};

    String test1 = "aba;klk;lkl;abaki;lk;lkihgjhfaba[pr[]weo";
    String test2 = "1'l;1k;l1k 1l1k1;k1 1;lk";
        System.out.println(Arrays.toString(orderArrayByStringLength(test)));*/

    public static boolean isPalindrome(String str) {

        return str.equals(new StringBuilder(str).reverse().toString());

    }
    public static boolean learnAboutString(String testString) {

        return testString.matches("[a-zA-Z_]\\w*");
    }
    public static String getRandomWords() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your line");
        String testString = sc.nextLine();
        StringBuilder str = new StringBuilder(testString);

        char j = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == j) {
                str.deleteCharAt(i);
            }
        }

        char[] desiredArray = new char[(int) (Math.random() * str.length())];
        for (int i = 0; i < desiredArray.length; i++) {
            desiredArray[i] = str.charAt((int) (Math.random() * str.length()));
        }
        return Arrays.toString(desiredArray);
    }
    public static boolean isPalindromeWithout() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your line");
        String testString = sc.nextLine();
        StringBuilder str = new StringBuilder(testString);

        char j = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == j) {
                str.deleteCharAt(i);
            }
        }

        int x = 0;
        int k = str.length() - 1;
        boolean result = true;

        while (k > x) {
            if (str.charAt(k) != str.charAt(x)) {
                result = false;
            }
            x++;
            k--;
        }
        return result;


    }
    public static String getRemovalDuplicateCharacters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your line");
        String testString = sc.nextLine();

        StringBuilder methodString = new StringBuilder(testString);
        char j = ' ';

        for (int i = 0; i < methodString.length(); i++) {
            if (methodString.charAt(i) == j) {
                methodString.deleteCharAt(i);
            }
        }
        System.out.println(methodString);
        char[] testArray = methodString.toString().toCharArray();
        StringBuilder stringBuilder = new StringBuilder(Arrays.toString(testArray));
        for (int i = 1; i < testArray.length; i++) {
            Arrays.sort(testArray);
            System.out.println(testArray);
            if (testArray[i - 1] == testArray[i]) {
                stringBuilder.deleteCharAt(i);
            }

        }
        return stringBuilder.toString();
    }
    public static String[] getOnlyNumbersFromString(String testString) {

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(testString);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        String[] test = new String[count];

        Matcher matcher1 = pattern.matcher(testString);
        count = 0;
        while (matcher1.find()) {
            test[count] = testString.substring(matcher1.start(), matcher1.end());
            count++;
        }

        return test;
    }
    public static String getStringWithChangedWords(String testString) {

        return testString.replaceAll("word", "letter");

    }
    public static int findNumberOccurrencesABA(String testString) {
        Pattern pattern = Pattern.compile("aba");
        Matcher matcher = pattern.matcher(testString);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
    public static int getSumDigitsInText(String testString) {

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(testString);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        String[] desiredArray = new String[count];

        Matcher matcher1 = pattern.matcher(testString);
        count = 0;
        while (matcher1.find()) {
            desiredArray[count] = testString.substring(matcher1.start(), matcher1.end());
            count++;
        }


        int result = 0;
        for (int i = 0; i < desiredArray.length; i++) {
            result = result + Integer.valueOf(desiredArray[i]);
        }
        return result;
    }
    public static String[] orderArrayByStringLength(String[] stringsArray) {


        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < stringsArray.length; i++) {
                if (stringsArray[i - 1].length() > stringsArray[i].length()) {
                    String temp;
                    temp = stringsArray[i - 1];
                    stringsArray[i - 1] = stringsArray[i];
                    stringsArray[i] = temp;
                    isSorted = false;
                }
            }
        }
        return stringsArray;
    }


}
