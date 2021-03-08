package OOP.HW_TenderSystem;

import java.util.ArrayList;
import java.util.List;

public class Brigade {

    private final List<Worker> brigade = new ArrayList<>();
    private int brigadeSalary = 0;

    public Brigade() {
    }

    public List<Worker> getBrigade() {
        return brigade;
    }

    public int getBrigadeSalary() {
        return brigadeSalary;
    }

    public void addWorkerToBrigade(Worker worker) {
        this.brigade.add(worker);
        this.brigadeSalary += worker.getSalary();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "brigade=" + brigade +
                ", brigadeSalary=" + brigadeSalary +
                '}';
    }
}
