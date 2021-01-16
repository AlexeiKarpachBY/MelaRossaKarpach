package SimpleTask.StringWork;

public class StringNumberFour {

    /*String test = "To be or not to be";
    findWhoFaster(test, 'T', 'b');*/

    public static String copyLine(String str) {

        return String.join(",", str, str, str) + str.length();

    }
    public static char[] characterOutput(String str) {

        char[] strArray = new char[3];
        strArray[0] = str.charAt(0);
        strArray[1] = str.charAt(str.length() - 1);
        if (str.length() % 2 == 0) {
            strArray[2] = ' ';
        } else strArray[2] = str.charAt(str.length() / 2);

        return strArray;
    }
    /* public static String getNewString(char numbers, char letters) {

        String str = new String(new char[10]) ;


        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                str.charAt(i) = letters;
                letters++;
            }
            if (i % 2 == 0) {
               str.replace(str.charAt(i), numbers) ;

            }
        }
        return str;
    }*/
    public static void getMatchNumbers(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1)) {
                System.out.println("Match number " + i);
            }
        }
    }
    public static void getEveryThird(String str) {
        for (int i = 2; i < str.length(); i = i + 3) {
            System.out.println("Third symbol " + str.charAt(i));
        }

    }
    public static void getNumbers(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.length() <= 5) {
                System.out.println("Number " + str.charAt(0));
            }
            if (str.length() > 5 && i < 3) {
                System.out.println("Number " + str.charAt(i));
            }
            if (str.length() > 5 && i > (str.length() - 4)) {
                System.out.println("Number " + str.charAt(i));
            }
        }
    }
    public static void findWhoFaster(String str, char first, char second) {


        if (str.indexOf(first) < str.indexOf(second)) {
            System.out.println("First is faster");
        }
        if (str.indexOf(second) < str.indexOf(first)) {
            System.out.println("Second faster");
        }
        if (false) {
            System.out.println("Any char LOST");

        }
    }

}

