package SimpleTask.CodeWars;

public class CreatePhoneNumber {
   /* Write a function that accepts an array of 10 integers (between 0 and 9),
    that returns a string of those numbers in the form of a phone number.*/

    public static void main(String[] args) {
        int [] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // => returns "(123) 456-7890"

        System.out.println(createPhoneNumber(numbers));
    }
    public static String createPhoneNumber(int[] numbers) {
        String s = "("
                .concat(String.valueOf(numbers[0]))
                .concat(String.valueOf(numbers[1]))
                .concat(String.valueOf(numbers[2]))
                .concat(")")
                .concat(" ")
                .concat(String.valueOf(numbers[3]))
                .concat(String.valueOf(numbers[4]))
                .concat(String.valueOf(numbers[5]))
                .concat("-")
                .concat(String.valueOf(numbers[6]))
                .concat(String.valueOf(numbers[7]))
                .concat(String.valueOf(numbers[8]))
                .concat(String.valueOf(numbers[9]));

        return s;
    }
}
