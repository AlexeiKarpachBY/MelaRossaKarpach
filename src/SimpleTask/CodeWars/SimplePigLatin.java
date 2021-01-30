package SimpleTask.CodeWars;

/* Move the first letter of each word to the end of it,
,then add "ay" to the end of the word. Leave punctuation marks untouched.

     pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
     pigIt('Hello world !');     // elloHay orldway !
     hisTay siay ymay tringsay*/

public class SimplePigLatin {
    public static void main(String[] args) {

        String str1 = "Hello world !";


        System.out.println(pigIt(str1));

    }

    public static String pigIt(String str) {
        String result = "";

        String[] array = str.split(" ");
        for (String j : array) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] arr = j.toCharArray();
            for (int i = 1; i < arr.length; i++) {
                stringBuilder.append(arr[i]);
            }
            stringBuilder
                    .append(j.charAt(0))
                    .append("ay");

            result = result
                    .concat(String.valueOf(stringBuilder))
                    .concat(" ");
        }

        if (result.charAt(result.length() - 4) == '!' | result.charAt(result.length() - 4) == '?') {
            StringBuilder stringBuilder = new StringBuilder(result);
            stringBuilder.replace(stringBuilder.length() - 3, stringBuilder.length() - 1, "");
            result = String.valueOf(stringBuilder);
        }
        return result.trim();
    }

}
