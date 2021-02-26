package OOP.HW_ValidationSystem;

public class PasswordStatus<T> implements Validator<T>  {


    @Override
    public Boolean validate(T number) {
        System.out.println("Password is OK");
        return false;
    }
}
