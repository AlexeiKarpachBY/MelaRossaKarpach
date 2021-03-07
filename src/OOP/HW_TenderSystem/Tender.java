package OOP.HW_TenderSystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Tender {

    private Map<Professions, Integer> professions = new HashMap<>();
    private   Integer salaryLimit;

    public Tender(int salaryLimit) {
        this.salaryLimit = salaryLimit;
    }

    public Map<Professions, Integer> getProfessions() {
        return professions;
    }

    public Integer getSalaryLimit() {
        return salaryLimit;
    }

    public void addProfessionToTender(Professions profession, Integer professionLimit) {
        this.professions.put(profession, professionLimit);
    }

    private boolean salaryMatch(Brigade brigade) {
        int brigadeSalary = 0;

        for (Worker worker : brigade.getBrigade()) {
            brigadeSalary = brigadeSalary + worker.getSalary();
        }

        return brigadeSalary <= getSalaryLimit();
    }

    private boolean professionsMatch(int professionLimit, Professions professions, Brigade brigade) {
        int brigadeProfessionCounter = 0;

        for (Worker worker : brigade.getBrigade()) {
            if (worker.getProfession().contains(professions)) {
                brigadeProfessionCounter++;
            }
        }
        return professionLimit <= brigadeProfessionCounter;
    }

}

