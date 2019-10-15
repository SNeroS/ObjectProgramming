public class HeavyVehicle extends Vehicle {

    private int _brakeCounter;
    private int _accelerationCounter;

    public HeavyVehicle(String brand, ServiceStation associatedStation) {
        super(brand, associatedStation);
        _brakeCounter = 0;
        _accelerationCounter = 0;
    }

    public void honk() {
        System.out.println("POO POO");
    }

    public void accelerate() {
        _accelerationCounter++;
        System.out.println("VRUM VRUM");
    }

    public void brake() {
        _brakeCounter++;
        System.out.println("GRRR GRRR");
    }

    public void counters() {
        System.out.printf("Brake counter: %d\n", _brakeCounter);
        System.out.printf("Acceleration counter: %d\n", _accelerationCounter);        
    }
}