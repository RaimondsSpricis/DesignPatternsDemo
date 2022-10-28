package rs.creational.builder;

public class BuilderPattern {

    public static void run() {
        System.out.println("=== Builder Pattern ===");
        var itOffice = new ITOffice();
        var c1 = itOffice.createSimpleComputer();
        var c2 = itOffice.createDevLinuxComputer();
        System.out.println("Simple computer: " + c1);
        System.out.println("Dev Linux computer: " + c2);
        System.out.println();
    }
}
