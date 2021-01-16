package OOP.All_Lessons.LessonTHREE;

public class Oval extends Shape implements Roll {
    protected String form;

    public Oval(String color, String form) {
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
        System.out.println("Draw OVAL" + " " + getColor() + " " + getForm());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Oval)) return false;
        Oval that = (Oval) obj;
        return form.equals(that.form);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + form.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Oval {"
                + "form = " + form
                + "color = " + color;
    }

    @Override
    public void Roll() {
        System.out.println("Go GO Go");
    }
}
