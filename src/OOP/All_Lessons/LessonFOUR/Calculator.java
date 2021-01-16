package OOP.All_Lessons.LessonFOUR;

import OOP.All_Lessons.LessonTWO.EqualsHash;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    public BigDecimal division (double a, double b) {
        return new BigDecimal(a).divide(new BigDecimal(b), 0, RoundingMode.HALF_DOWN);
    }

    public int multiplication (int a, int b) {
        return a*b;
    }

    public int difference(int a, int b) {
        return a-b;
    }

    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public String toString() {
        return "Calculator{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return obj instanceof Calculator;
    }
}
