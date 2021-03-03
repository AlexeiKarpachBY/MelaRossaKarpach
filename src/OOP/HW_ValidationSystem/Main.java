package OOP.HW_ValidationSystem;

public class Main {
    public static void main(String[] args) throws ValidationFailedException {

        ValidatorFactory factory = new ValidatorFactory();
        factory.addValidationClass("string", new StringValidator());
        factory.addValidationClass(132, new IntegerValidator());


        System.out.println(factory.validate(1));
        System.out.println(factory.validate(12));
        System.out.println(factory.validate("Hi"));
        System.out.println(factory.validate("hi"));


    }
}
