package structural_dp.bridge.exercise.bridge2.implementations;

public class Subject {
    private String name;
    private int credits;

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void printSubject() {
        System.out.println(this.name + "----" + this.credits + " tin chi\n");
    }
}
