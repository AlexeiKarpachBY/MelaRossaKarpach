package OOP.HW_TenderSystem;

public class Main {
    public static void main(String[] args) {
        Worker trest1 = new Worker("Alex", 500, Professions.DRIVER);
        Worker trest2 = new Worker("Petr", 500, Professions.DRIVER, Professions.BUILDER);
        Worker trest3 = new Worker("Elena", 500, Professions.FINISHER);

        Brigade brigade = new Brigade();
        brigade.addWorkerToBrigade(trest1);
        brigade.addWorkerToBrigade(trest2);
        brigade.addWorkerToBrigade(trest3);


        Tender library = new Tender(1500);
        library.addProfessionToTender(Professions.BUILDER, 1);
        library.addProfessionToTender(Professions.DRIVER, 2);
        library.addProfessionToTender(Professions.FINISHER, 1);



    }


}
