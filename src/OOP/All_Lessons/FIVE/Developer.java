package OOP.All_Lessons.FIVE;

import java.util.Comparator;

public class Developer /*implements Comparable, Comparator*/ {
    private String name;
    private int salary;

    public void setName(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


  /*  @Override
    public int compareTo(Object dev) {
        return this.name.compareTo(dev.name);
    }

    @Override
    public int compare(Object dev1, Object dev2) {
        return dev1.salary - dev2.salary;
    }*/

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
