public class Demo07 {
    public static void main(String[] args) {
        Printer p = new BasicPrinter();
        p.print("Hello");

        MultiFunctionMachine m = new MultiFunctionMachine();
        m.print("Hi");
        m.scan("/tmp/out");
        m.fax("12345");
    }
}
