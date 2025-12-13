public class Main {
    public static void main(String[] args) {
        PatientList patient1 = new PatientList();

        Patient p1 = new Patient(1,"Zeynep",1,21);
        Patient p2 = new Patient(2,"Eren",2,30);
        Patient p3 = new Patient(3,"Alper",3,16);
        Patient p4 = new Patient(4,"Gizem",4,43);
        Patient p5 = new Patient(5,"Furkan",6,20);

        patient1.addPatient(p1);
        patient1.addPatient(p2);
        patient1.addPatient(p3);
        patient1.addPatient(p4);
        patient1.addPatient(p5);

        System.out.println();

        patient1.removePatient(5);

        System.out.println();

        System.out.println(patient1.findPatient(1));

        System.out.println();
        patient1.printList();


    }

}