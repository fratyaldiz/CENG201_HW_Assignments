public class HospitalTest {
    public static void main(String[] args) {

        HospitalSystem hs = new HospitalSystem();

        //Add 10 patients
        hs.addPatient(new Patient(1, "Zeynep", 1, 21));
        hs.addPatient(new Patient(2, "Haydar", 2, 30));
        hs.addPatient(new Patient(3, "Alper", 3, 16));
        hs.addPatient(new Patient(4, "Gizem", 4, 43));
        hs.addPatient(new Patient(5, "Barış", 6, 20));
        hs.addPatient(new Patient(6, "Selen", 5, 28));
        hs.addPatient(new Patient(7, "Eren", 8, 35));
        hs.addPatient(new Patient(8, "Sümeyra", 7, 26));
        hs.addPatient(new Patient(9, "Toygun", 9, 40));
        hs.addPatient(new Patient(10, "Mustafa", 10, 50));

        // Add 5 normal treatment requests and 3 priority treatment requests
        hs.addTreatmentRequest(1, false);
        hs.addTreatmentRequest(2, false);
        hs.addTreatmentRequest(3, false);
        hs.addTreatmentRequest(4, false);
        hs.addTreatmentRequest(5, false);

        hs.addTreatmentRequest(6, true);
        hs.addTreatmentRequest(7, true);
        hs.addTreatmentRequest(8, true);

        //Add 2 discharge records
        hs.addDischargeRecord(9);
        hs.addDischargeRecord(10);

        //Process 4 treatment requests (priority first)
        hs.processTreatment();
        hs.processTreatment();
        hs.processTreatment();
        hs.processTreatment();

        //Print final system state
        hs.printSystemState();
    }
}
