package OOP.All_Lessons.LessonFOUR;

public class Main {

    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        Calculator calculator1 =new Calculator();
        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();


        System.out.println(calculator.multiplication(10, 2));
        System.out.println(calculator.division(10, 2));
        System.out.println(calculator.sum(10, 2));
        System.out.println(calculator.difference(10, 2));

        System.out.println(engineeringCalculator.squareRoot(9));
        System.out.println(engineeringCalculator.exponentiation(3, 3));


        System.out.println(calculator.equals(calculator1));
    }
}
