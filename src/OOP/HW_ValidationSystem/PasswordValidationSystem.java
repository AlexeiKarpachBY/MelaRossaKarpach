package OOP.HW_ValidationSystem;

public class PasswordValidationSystem<T> extends ValidationSystem{

    public PasswordValidationSystem(T t) {
        super();
        new PasswordStatus().validate(t);
    }
}
