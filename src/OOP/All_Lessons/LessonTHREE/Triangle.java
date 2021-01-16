package OOP.All_Lessons.LessonTHREE;

public class Triangle extends Shape {
    protected String form;

    public Triangle(String color, String form) {
        super(color);
        this.form = form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setColor(String color) {
        this.color = form;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Draw TRIANGLE" + " " + getColor() + " " + getForm());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Oval)) return false;
        Triangle that = (Triangle) obj;
        if (!form.equals(that.form)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + form.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle {"
                + "form = " + form;
    }


}
