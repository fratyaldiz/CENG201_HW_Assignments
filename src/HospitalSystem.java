import java.util.HashMap;

public class HospitalSystem {
    private PatientList patientList;
    private TreatmentQueue priorityQueue;
    private TreatmentQueue normalQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer, Patient> patientMap;

    public HospitalSystem(){
        patientList = new PatientList();
        priorityQueue = new TreatmentQueue();       //Queue for emergency patient
        normalQueue = new TreatmentQueue();         //Queue for normal patient
        dischargeStack = new DischargeStack();
        patientMap = new HashMap();
    }

    //add new patient
    public void addPatient(Patient patient){
        patientList.addPatient(patient);
        patientMap.put(patient.id, patient);
    }

    // Add Treatment Request (normal or priority)
    public void addTreatmentRequest(int patientId, boolean priority){
        TreatmentRequest request = new TreatmentRequest(patientId, priority);

        if(priority){
            priorityQueue.enqueue(request);     // emergency patient
        }
        else{
            normalQueue.enqueue(request);       //normal patient
        }
    }
    // Adds discharge record
    public void addDischargeRecord(int patientId) {
        dischargeStack.push(new DischargeRecord(patientId));
    }


    //Treatment procedure (emergency patients firs)
    public void processTreatment(){
        TreatmentRequest request;

        if ( priorityQueue.size()> 0 ){
            request = priorityQueue.dequeue();  //take from priortiy queue
        }
        else{
            request = normalQueue.dequeue();    //take from normal queue
        }
        if(request != null){
            dischargeStack.push(new DischargeRecord(request.patientId));
        }
        else {
            System.out.println("No available treatment request");
        }
    }

    // Print System Status
    public void printSystemState(){
        System.out.println("Patients: ");
        patientList.printList();

        System.out.println("Priority Treatment Queue: ");
        priorityQueue.printQueue();

        System.out.println("Normal Treatment Queue: ");
        normalQueue.printQueue();

        System.out.println("Discharge Stack: ");
        dischargeStack.printStack();
    }

}
