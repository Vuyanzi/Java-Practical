public class MountainBike extends Bicycle {
    private int gear;

    public MountainBike(String name, int wheels, int pedals, int breaks, int gear) {
        super(name, 2, 2, 2);
        this.gear = gear;
    }

}
