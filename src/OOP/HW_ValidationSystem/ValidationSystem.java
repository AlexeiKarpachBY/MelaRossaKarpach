package OOP.HW_ValidationSystem;


import OOP.Exceptions.ValidationFailedException;

public class ValidationSystem<T> {

    public ValidationSystem(T t) {
        if (t instanceof String) {
            try {
                new LoginValidationSystem<>(t);
            } catch (ValidationFailedException e) {
                e.printStackTrace();
            }
        }
        if (t instanceof Integer) {
            new PasswordValidationSystem<>(t);
        }
    }

    public ValidationSystem() {

    }
}
