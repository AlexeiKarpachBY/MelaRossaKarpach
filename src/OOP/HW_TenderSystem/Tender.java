package OOP.HW_TenderSystem;

import java.util.*;


public class Tender {

    private final Map<Professions, Integer> professions = new HashMap<>();
    private final List<Brigade> tenderBrigades = new ArrayList<>();


    public Map<Professions, Integer> getProfessions() {
        return professions;
    }

    public List<Brigade> getTenderBrigades() {
        return tenderBrigades;
    }


    public void addProfessionToTender(Professions profession, Integer professionLimit) {
        this.professions.put(profession, professionLimit);
    }

    public void addBrigadeToTender(Brigade brigade) {
        this.tenderBrigades.add(brigade);
    }

    public Brigade chooseMostSuitableBrigade() {
        Brigade brigade = new Brigade();
        removeInappropriateBrigades();
        try {
            if (tenderBrigades.isEmpty()) {
                throw new TenderFailedException("There are no suitable brigades");
            }
            tenderBrigades.sort(Comparator.comparing(Brigade::getBrigadeSalary));
            brigade = tenderBrigades.get(0);

        } catch (TenderFailedException e) {
            e.printStackTrace();
        }
        return brigade;
    }
    private void removeInappropriateBrigades() {
        tenderBrigades.removeIf(brigade -> !professionsMatch(brigade));
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
        return "Tender{" +
                "professions=" + professions +
                ", tenderBrigades=" + tenderBrigades +
                '}';
    }
}



