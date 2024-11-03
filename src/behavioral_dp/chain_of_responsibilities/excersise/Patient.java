package behavioral_dp.chain_of_responsibilities.excersise;

public class Patient {
    private Long patientId;
    private String name;
    private String symptoms;

    public Patient(Long patientId, String name, String symptoms) {
        this.patientId = patientId;
        this.name = name;
        this.symptoms = symptoms;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public void printInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Symptoms: " + symptoms);
    }
}
