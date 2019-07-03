public class Patient extends Person {
    private String sickeness;

    public Patient(int legs, int head, int hands, String sickeness) {
        super(legs, head, hands);
        this.sickeness = sickeness;
    }
}
