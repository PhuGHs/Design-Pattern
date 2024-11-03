package behavioral_dp.chain_of_responsibilities.excersise;

public class Request {
    private Patient patient;
    private String healthStatus;

    public Request(Patient patient, String healthStatus) {
        this.patient = patient;
        this.healthStatus = healthStatus;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void displayPatient() {
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Health Status: " + healthStatus);
    }
}
