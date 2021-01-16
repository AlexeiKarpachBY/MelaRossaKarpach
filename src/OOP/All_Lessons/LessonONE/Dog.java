package OOP.All_Lessons.LessonONE;

public class Dog {
    String breed;
    int age;
    String color;

    public Dog() {
    }

    public Dog(String color) {
        this.color = color;
    }

    public Dog (String color, String breed, int age) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }


    void barking() {
        System.out.println("Barking");
    }

    void hungry() {
        System.out.println("Hungry");
    }

    void sleeping() {
        System.out.println("Sleeping");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }
}
