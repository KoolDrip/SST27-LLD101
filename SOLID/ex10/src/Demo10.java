public class Demo10 {
    public static void main(String[] args) {
        // Console-based
        ReportService report1 = new ReportService(new ConsoleLogger());
        report1.generate();

        System.out.println("Check report.log for file logs.");
    }
}