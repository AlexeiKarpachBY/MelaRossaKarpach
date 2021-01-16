package OOP.All_Lessons.LessonTHREE;

import OOP.All_Lessons.LessonTWO.EqualsHash;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    protected abstract void draw();


}
