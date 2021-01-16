package OOP.All_Lessons.LessonTHREE;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", "Circle");
        Shape triangle = new Triangle("Blue", "Triangle");
        Shape rectangle = new Rectangle("Black", "Rectangle");
        Shape oval = new Oval("Pink", "Oval");

        Shape[] test = {circle, triangle, rectangle, oval};

        for (Shape x : test) x.draw();

     Oval o = new Oval("red", "red");

     o.Roll();


    }

}
