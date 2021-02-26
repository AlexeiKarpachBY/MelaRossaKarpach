package OOP.HW_ValidationSystem;

import OOP.Exceptions.ValidationFailedException;

public interface  Validator<T> {

   Boolean validate(T t) throws ValidationFailedException;


}
