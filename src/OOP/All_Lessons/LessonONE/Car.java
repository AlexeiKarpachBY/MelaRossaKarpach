package OOP.All_Lessons.LessonONE;

public class Car {
    private String color;
    private String model;

    public Car() {
    }

    public Car(String color) {
        this.color =color;
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public void run() {
        System.out.println("Car - run ...");
    }

    public void stop() {
        System.out.println("Car - stop ...");
    }

    public void info() {
        System.out.println(model + "\n" + color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
