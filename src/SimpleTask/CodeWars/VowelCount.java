package SimpleTask.CodeWars;

public class VowelCount {
    public static void main(String[] args) {


    }

    String str = "Abracadabra";

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] array = str.toCharArray();
        for (char c : array) {
            if (c == 'a' | c == 'o' | c == 'e' | c == 'i' | c == 'u') {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }

}