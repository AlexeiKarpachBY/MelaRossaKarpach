package OOP.HW_TenderSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Tender {

    private final Map<Professions, Integer> professions = new HashMap<>();
    private final Integer salaryLimit;
    private final List<Brigade> tenderBrigades = new ArrayList<>();

    public Tender(int salaryLimit) {
        this.salaryLimit = salaryLimit;
    }

    public Map<Professions, Integer> getProfessions() {
        return professions;
    }
    public List<Brigade> getTenderBrigades() {
        return tenderBrigades;
    }
    public Integer getSalaryLimit() {
        return salaryLimit;
    }

    public void addProfessionToTender(Professions profession, Integer professionLimit) {
        this.professions.put(profession, professionLimit);
    }
    public void addBrigadesToTender(Brigade brigade) {
        this.tenderBrigades.add(brigade);
    }

    public Brigade chooseBrigadeForTender() {
        Brigade brigadeForSigning = new Brigade();
        int profitablePrice = 0;
        for (Brigade brigade : getTenderBrigades()) {
            if (salaryMatch(brigade) && professionsMatch(brigade)) {
                brigadeForSigning = brigade;
                profitablePrice = brigade.getBrigadeSalary();
            }
        }
        return brigadeForSigning;
    }

    private boolean salaryMatch(Brigade brigade) {
        int brigadeSalary = 0;

        for (Worker worker : brigade.getBrigade()) {
            brigadeSalary = brigadeSalary + worker.getSalary();
        }

        return brigadeSalary <= getSalaryLimit();
    }
    private boolean professionsMatch(Brigade brigade) {
        boolean brigadeStatus = false;
        for (Professions profession : professions.keySet()) {
            Integer professionLimit = professions.get(profession);
            int professionBrigadeCounter = 0;
            for (Worker worker : brigade.getBrigade()) {
                if (worker.getProfession().contains(profession)) {
                    professionBrigadeCounter++;
                }
            }
            if (professionBrigadeCounter < professionLimit) {
                return false;
            } else brigadeStatus = true;
        }
        return brigadeStatus;
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



