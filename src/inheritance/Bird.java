public class Bird extends Animal {
    private int wings;

    public Bird(int eyes, int legs, int teeth, int tail, String coat, int wings) {
        super(eyes, legs, teeth, tail, coat);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
