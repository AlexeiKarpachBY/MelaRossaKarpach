package OOP.HW_ValidationSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator<T extends String> extends ValidatorFactory<T> implements Validation<T> {

    @Override
    public boolean validate(String str) {
        Pattern pattern = Pattern.compile("^[A-Z]+");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

}
