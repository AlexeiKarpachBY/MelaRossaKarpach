package OOP.HW_ValidationSystem;

public class Main {
    public static void main(String[] args) throws ValidationFailedException {

        ValidatorFactory factory = new ValidatorFactory();
        factory.addValidationClass(132, new IntegerValidator());
        factory.addValidationClass("string", new StringValidator());
        System.out.println(factory.getValidationClasses());
        factory.removeValidationClass("string");
        System.out.println(factory.getValidationClasses());
        factory.addValidationClass("string", new StringValidator());


        try {
            System.out.println(factory.validate(1));
            System.out.println(factory.validate(12));
            System.out.println(factory.validate("Hi"));
            System.out.println(factory.validate("hi"));
            System.out.println(factory.validate(false));
        } catch (ValidationFailedException e) {
            e.printStackTrace();
        }




    }
}
