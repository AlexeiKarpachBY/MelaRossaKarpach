package OOP.HW_ValidationSystem;

import OOP.Exceptions.ValidationFailedException;

public class LoginStatus<T> implements Validator<T>{


    @Override
    public Boolean validate(T str)throws ValidationFailedException {
        throw new ValidationFailedException("Wrong LOGIN");
    }
}
