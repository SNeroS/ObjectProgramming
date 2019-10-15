public class Ex2 {
    public static void main (String Args[]) {

        ServiceStation s1 = new ServiceStation(50);

        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
        System.out.printf("%d\n", s1.getFuel());
        System.out.printf("%d\n", s1.getPump(3));
        System.out.printf("%d\n", s1.fuelStation(10, 3));
        System.out.printf("%d\n", s1.getPump(3));
        s1.addFuel(10);
        System.out.println(s1.isFull());

        Vehicle v1 = new Vehicle("BMW", s1);
        HeavyVehicle v2 = new HeavyVehicle("Looongo", s1);

        System.out.printf("%d\n", v1.fuelCar(10,3));
        System.out.printf("%d\n", s1.getPump(3));
        System.out.printf("%d\n", s1.getFuel());

        v2.honk();
        v1.accelerate();
        for(int i = 0; i < 10; i++)
            v2.accelerate();
        v2.counters();
    }
}