public class Ex1 {
    public static void main (String args[]) {

        NumberWithMemory n1 = new NumberWithMemory (10);

        n1.setNumber(5);
        System.out.printf("%d\n", n1.getPrevious());

        n1.changeNumber();
        System.out.printf("%d\n", n1.getPrevious());

        n1.changeNumber();
        System.out.printf("%d\n", n1.getPrevious());
    }
}