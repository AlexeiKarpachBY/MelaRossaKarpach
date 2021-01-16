package OOP.All_Lessons.LessonTWO;

public class Person {
    private String fullName;
    private int age;
    private boolean retired;

    public Person (String fullName, int age, boolean retired) {
        this.fullName = fullName;
        this. age = age;
        this.retired = retired;
    }

    public int getAge() {
        return age;
    }
    public String getFullName() {
        return fullName;
    }

    public boolean isRetired() {
        return retired;
    }

    @Override
    public String toString() {
        return "Person {"
                + "fullName = '" + fullName + '\''
                +", age = " +age
                +", retired = " +retired
                +'}';
    }
}
