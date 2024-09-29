package creational_dp.singleton;

public class Client {
    public static void main(String[] args) {
        PatientRecordManager manager = PatientRecordManager.getInstance();

        PatientRecord firstRecord = new PatientRecord("1", "A", 22, "Cough");
        PatientRecord secondRecord = new PatientRecord("2", "AB", 45, "Tuberculosis");
        PatientRecord thirdRecord = new PatientRecord("3", "ABC", 23, "Heart Disease");

        manager.addPatientRecord(firstRecord);
        manager.addPatientRecord(secondRecord);
        manager.addPatientRecord(thirdRecord);

        manager.getPatientRecord("2");
    }
}
