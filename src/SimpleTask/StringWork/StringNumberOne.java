package SimpleTask.StringWork;

import java.util.Arrays;
import java.util.Scanner;

public class StringNumberOne {

    public static void getSortUP(String[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1].length() > array[i].length()) {
                    String temp;
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
        }
    }
    public static String[] getSortDown(String[] array) {
        boolean isSorted = false;
        while (isSorted == false) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1].length() < array[i].length()) {
                    String temp;
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }
    public static String[] keyboardInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines do you want to enter?");
        int numbersOfLines = sc.nextInt();

        String[] array = new String[numbersOfLines];
        sc.nextLine();

        for (int i = 0; i < numbersOfLines; i++) {
            System.out.println("Enter line number " + (i + 1));
            array[i] = sc.nextLine();
        }
        return array;
    }
    public static String findShortestLongestStrings() {

        String[] array = keyboardInput();
        getSortUP(array);

        String testString = array[0];
        String testString1 = array[array.length - 1];

        return (testString + "   " + testString.length()) + "\n" +
                (testString1 + "   " + testString1.length());


    }
    public static String sortAllStrings() {


        String[] array = keyboardInput();
        getSortUP(array);
        return Arrays.toString(array);
    }
    public static String getMoreThanAverage() {

        String[] array = keyboardInput();
        getSortUP(array);

        String[] str = new String[array.length / 2];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                str[j] = array[i] + " " + String.valueOf(array[i].length());
            }
            j++;
        }
        return Arrays.toString(str);

    }
    public static String findMonth() {

        String[] monthArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        String str = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number (1-12):");
        int number = sc.nextInt();

        if (number > 0 && number < 13) {
            str = monthArray[number - 1];
        } else {
            System.out.println("Wrong number");
        }

        return str;
    }
    public static String findDiverseWord() {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to enter?");
        int numbersOfWords = sc.nextInt();

        String[] array = new String[numbersOfWords];
        sc.nextLine();

        for (int i = 0; i < numbersOfWords; i++) {
            System.out.println("Enter your word:");
            array[i] = sc.nextLine();
        }


        String word = "";
        boolean status = true;
        while (status = true) {
            for (int i = 0; i < array.length; i++) {
                for (int k = 0; k < array[i].toCharArray().length; k++) {
                    Arrays.sort(array[i].toCharArray());
                    for (int j = 1; j < array[i].toCharArray().length; j++) {
                        if (array[i].charAt(k) == array[i].charAt(j)) {
                            break;
                        }
                    }
                }
            }

        }


        return "Ваше слово " + word;
    }

}
