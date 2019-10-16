public class Vehicle {

    private String _brand;
    private ServiceStation _associatedStation;

    public Vehicle(String brand, ServiceStation associatedStation) {
        _brand = brand;
        _associatedStation = associatedStation;
    }

    public void accelerate() {
        System.out.println("VRUM VRUM");
    }

    public void brake() {
        System.out.println("GRRR GRRR");
    }

    public void honk() {
        System.out.println("PIII PIII");
    }

    public String getBrand() {
        return _brand;
    }

    public ServiceStation getStation() {
        return _associatedStation;
    }

    public void switchStation(ServiceStation station) {
        _associatedStation = station;
    }

    public int fuelCar(int fuel, int id) {
        return _associatedStation.fuelStation(fuel, id);
    }
}