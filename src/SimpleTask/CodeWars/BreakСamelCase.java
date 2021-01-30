package SimpleTask.CodeWars;

public class BreakСamelCase {

    /*  Complete the solution so that the function will break up camel casing, using a space between words.*/

    public static void main(String[] args) {
        String s = "camelCasingTest";
        System.out.println(camelCase(s));
    }

    public static String camelCase(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);

        char[] array = input.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String str = new String(String.valueOf(array[i]));
            if (str.equals(str.toUpperCase())) {
                stringBuilder.insert(i + count, " ");
                count++;
            }
        }
        return stringBuilder.toString();
    }
}
