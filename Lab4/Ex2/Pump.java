public class Pump {
    
    private int _id;
    private boolean _free;
    private int _consumption;

    public Pump(int capacity, int id) {
            _id = id;
            _free = true;  
            _consumption = 0;  
    }

    public boolean isFree() {
        return _free;
    }

    public int getConsumption() {
        return _consumption;
    }

    public void addConsumption(int fuel) {
        _consumption += fuel;
    }

}