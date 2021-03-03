package OOP.HW_ValidationSystem;

public class IntegerValidator<T extends Integer> extends ValidatorFactory<T> implements Validation<T> {

    @Override
    public boolean validate(Integer integer) {

        return (integer>0 && integer<10);
    }

}
