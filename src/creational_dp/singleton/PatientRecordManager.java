package creational_dp.singleton;

import java.util.HashMap;
import java.util.Map;

public class PatientRecordManager {
    private static PatientRecordManager instance;

    private Map<String, PatientRecord> patientRecordMap;

    private PatientRecordManager() {
        patientRecordMap = new HashMap<>();
    }

    public static synchronized PatientRecordManager getInstance() {
        if (instance == null) {
            instance = new PatientRecordManager();
        }
        return instance;
    }

    public synchronized PatientRecord getPatientRecord(String patientId) {
        PatientRecord record = patientRecordMap.get(patientId);
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + record.getName());
        System.out.println("Age: " + record.getAge());
        System.out.println("Diagnosis: " + record.getDiagnosis());
        return record;
    }

    public synchronized void addPatientRecord(PatientRecord patientRecord) {
        if (!patientRecordMap.containsKey(patientRecord.getId())) {
            patientRecordMap.put(patientRecord.getId(), patientRecord);
        } else {
            return;
        }
    }

    public synchronized void updatePatientRecord(String patientId, PatientRecord patientRecord) {
        if (patientRecordMap.containsKey(patientId)) {
            patientRecordMap.put(patientId, patientRecord);
        } else {
            return;
        }
    }
}
