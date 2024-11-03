package behavioral_dp.chain_of_responsibilities.example;

public enum Severity {
    LOW(1), MEDIUM(2), HIGH(3);

    private final int level;

    private Severity(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
