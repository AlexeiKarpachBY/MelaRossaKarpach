package OOP.HW_ValidationSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValidatorFactory<T> implements Validation<T> {

    private final Map<String, ValidatorFactory<T>> validationClasses = new HashMap<>();

    public Set<String> getValidationClasses() {
        return validationClasses.keySet();
    }

    public void addValidationClass(T values, ValidatorFactory<T> v) {
        String key = String.valueOf(values.getClass());
        validationClasses.put(key, v);
    }

    public void removeValidationClass(T t) {
        String key = String.valueOf(t.getClass());
        validationClasses.remove(key);
    }

    @Override
    public boolean validate(T t) throws ValidationFailedException {
        String key = String.valueOf(t.getClass());
        ValidatorFactory<T> temp;

        if (validationClasses.containsKey(key)) {
            temp = validationClasses.get(key);
        } else throw new ValidationFailedException("This class is not in the validation system");

        return temp.validate(t);
    }
}
