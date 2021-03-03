package OOP.HW_ValidationSystem;

public interface Validation<T> {

    public boolean validate(T t) throws ValidationFailedException;

}
