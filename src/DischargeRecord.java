import java.text.SimpleDateFormat;
import java.util.Date;

public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String time = sdf.format(new Date(this.dischargeTime));

        return "PatientID=" + patientId + " dischargeTime=" + time;
    }
}
