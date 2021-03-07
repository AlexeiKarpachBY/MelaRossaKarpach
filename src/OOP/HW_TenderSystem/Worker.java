package OOP.HW_TenderSystem;

import java.util.Enumeration;
import java.util.HashSet;

public class Worker {
    String name;
    Integer salary;
    HashSet<Professions> profession = new HashSet<>();

    public Worker(String name, int salary, Professions profession) {
        this.name = name;
        this.salary = salary;
        this.profession.add(profession);
    }
    public Worker(String name, int salary, Professions professionOne, Professions professionsTwo) {
        this.name = name;
        this.salary = salary;
        this.profession.add(professionOne);
        this.profession.add(professionsTwo);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public HashSet<Professions> getProfession() {
        return profession;
    }

    public void addProfession(Professions professions) {
        this.profession.add(professions);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", profession=" + profession +
                '}';
    }
}
