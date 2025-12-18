public class TreatmentTest {
    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue();


        //Add 8 treatment requests.
        for (int i = 1; i <= 8; i++) {
            queue.enqueue(new TreatmentRequest(i));
        }

        //Process (dequeue) 3 requests.
        for (int i = 0; i<3; i++){
            TreatmentRequest processed = queue.dequeue();
            if(processed != null){
                System.out.println("Dequeded: " + processed.patientId);
            }
        }

        //Print the remaining queue
        queue.printQueue();
    }
}
