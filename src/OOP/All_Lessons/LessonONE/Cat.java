package OOP.All_Lessons.LessonONE;

public class Cat {
    private String breed;
    public int age;
    String color;
    String versionCat;
    static final int version = 5;
    public static int countCat = 0;


    public Cat() {
        countCat++;
    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String color, String breed, int age) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }


    void barking() {


        System.out.println("Barking");
    }

    static void hungry() {
        System.out.println("Hungry");
    }

    static void sleeping() {

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
}
