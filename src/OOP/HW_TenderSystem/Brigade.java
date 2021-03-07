package OOP.HW_TenderSystem;

import java.util.ArrayList;
import java.util.List;

public class Brigade {

    private final List<Worker> brigade = new ArrayList<>();

    public Brigade() {
    }

    public List<Worker> getBrigade() {
        return brigade;
    }

    public void addWorkerToBrigade(Worker worker) {
        this.brigade.add(worker);
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
        return super.toString();
    }
}
