package behavioral_dp.chain_of_responsibilities.example;

public class Ticket {
    private Severity severity;
    private String description;

    public Ticket(Severity severity, String description) {
        this.severity = severity;
        this.description = description;
    }

    public Severity getSeverity() {
        return severity;
    }

    public String getDescription() {
        return description;
    }
}
