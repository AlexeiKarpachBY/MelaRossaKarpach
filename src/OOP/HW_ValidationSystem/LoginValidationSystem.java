package OOP.HW_ValidationSystem;

import OOP.Exceptions.ValidationFailedException;

public class LoginValidationSystem<T> extends ValidationSystem {

    public LoginValidationSystem(T t) throws ValidationFailedException {
        super();
        new LoginStatus().validate(t);
    }
}
