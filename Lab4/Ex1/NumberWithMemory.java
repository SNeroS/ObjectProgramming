public class NumberWithMemory extends Number {
    
    private int _memory;

    public NumberWithMemory(int number) {
        super(number);
        _memory = number;
    }

    public void changeNumber() {
        int save;
        save = _number;
        _number = _memory;
        _memory = save;
    }

    public int getPrevious() {
        return _memory;
    }
}