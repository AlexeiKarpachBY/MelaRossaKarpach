package OOP.All_Lessons.LessonTWO;

import java.util.Arrays;

public class EqualsHash {
    private byte byteField1;
    private short shortField;
    private int intField;
    private long longField;
    private float floatFieeld;
    private double doubleField;
    private char charField;
    private boolean booleanField;
    private String stringField;
    private String[] arrayField;

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }
    public void setArrayField(String [] arrayField) {
        this.arrayField = arrayField;
    }
    public void setIntField(int intField) {
        this.intField = intField;
    }


    @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof EqualsHash)) return false;
            EqualsHash that = (EqualsHash) obj;

        if (byteField1 != that.byteField1) return false;
        if (shortField != that.shortField) return false;
        if (longField != that.longField) return false;
        if (intField != that.intField) return false;
        if (Float.compare(that.floatFieeld, floatFieeld) != 0) return false;
        if (Double.compare(that.doubleField, doubleField) != 0) return false;
        if (charField != that.charField) return false;
        if (booleanField != that.booleanField) return false;
        if (!stringField.equals(that.stringField)) return false;
        if (arrayField != that.arrayField) return false;
        return Arrays.equals(arrayField, that.arrayField);
    }
}
