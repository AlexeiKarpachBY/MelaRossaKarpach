package OOP.HW_TenderSystem;

public class Main {
    public static void main(String[] args) {
        Worker trest1 = new Worker("trest", 500, Professions.DRIVER);
        Worker trest2 = new Worker("trest", 500, Professions.DRIVER, Professions.BUILDER);
        Worker trest3 = new Worker("trest", 400, Professions.FINISHER);

        Worker telecom1 = new Worker("telecom", 500, Professions.DRIVER);
        Worker telecom2 = new Worker("telecom", 500, Professions.DRIVER, Professions.BUILDER);
        Worker telecom3 = new Worker("telecom", 300, Professions.FINISHER);

        Worker titan1 = new Worker("titan", 500, Professions.BUILDER);
        Worker titan2 = new Worker("titan", 500, Professions.DRIVER, Professions.BUILDER);
        Worker titan3 = new Worker("titan", 400, Professions.DIRECTOR);

        Brigade trest = new Brigade();
        trest.addWorkerToBrigade(trest1);
        trest.addWorkerToBrigade(trest2);
        trest.addWorkerToBrigade(trest3);

        Brigade telecom = new Brigade();
        telecom.addWorkerToBrigade(telecom1);
        telecom.addWorkerToBrigade(telecom2);
        telecom.addWorkerToBrigade(telecom3);

        Brigade titan = new Brigade();
        titan.addWorkerToBrigade(titan1);
        titan.addWorkerToBrigade(titan2);
        titan.addWorkerToBrigade(titan3);


        Tender library = new Tender(1500);
        library.addProfessionToTender(Professions.BUILDER, 1);
        library.addProfessionToTender(Professions.DRIVER, 2);
        library.addProfessionToTender(Professions.FINISHER, 1);
        library.addBrigadesToTender(trest);
        library.addBrigadesToTender(telecom);
        library.addBrigadesToTender(titan);

        System.out.println(library.chooseBrigadeForTender().toString());


    }


}
