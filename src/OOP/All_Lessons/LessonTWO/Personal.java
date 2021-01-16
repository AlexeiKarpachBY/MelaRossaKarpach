package OOP.All_Lessons.LessonTWO;

public class Personal {
    int age;
    String fullName;


    public Personal() {
    }

    public Personal(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void move() {
        System.out.println("Move");
    }
    public void talk() {
        System.out.println("Strong");
    }
    public void trashTalk() {
        System.out.println("Nutt");
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Personal)) return false;
        Personal that = (Personal) object;

        if (age != that.age) return false;
        if (!fullName.equals(that.fullName)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + fullName.hashCode();
        return result;
    }
}
