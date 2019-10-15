import java.util.ArrayList;

public class ServiceStation {

    private static ArrayList<Pump> _pump;
    private static int _capacity;
    private static int _fuel;

    public ServiceStation(int capacity) {
        _fuel = capacity;
        _capacity = capacity;
        _pump = new ArrayList<Pump>();
        for(int i = 0; i < 10; i++)
            _pump.add(i, new Pump(capacity, i));  
    }
    
    public boolean isEmpty() {
        return _fuel == 0;
    }

    public boolean isFull() {
        return _fuel == _capacity;
    }

    public int getFuel() {
        return _fuel;
    }

    public int getPump(int id) {
        return _pump.get(id).getConsumption();
    }

    public void addFuel(int fuel) {
        if(!isFull())
            _fuel += fuel;
    }

    public int fuelStation(int fuel, int id) {
        if(_pump.get(id).isFree() && !isEmpty()) {
            if(fuel >= _fuel) {
                _pump.get(id).addConsumption(_fuel);
                _fuel = 0;
                return _fuel;
            }
            _fuel -= fuel;
            _pump.get(id).addConsumption(fuel);
            return fuel;
        }
        return 0;
    }
}