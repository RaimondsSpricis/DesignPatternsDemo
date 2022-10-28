package rs.creational.builder;

public class ITOffice {

    public Computer createSimpleComputer() {
        return Computer.builder()
                .addHardwareModel("HP EliteBook 860 G9")
                .addOs("Windows 11 Enterprise")
                .addFirefox()
                .addLibreOffice()
                .build();
    }

    public Computer createDevLinuxComputer() {
        return Computer.builder()
                .addHardwareModel("Lenovo ThinkPad T16 Gen 1")
                .addOs("Fedora 37")
                .addChrome()
                .addEdge()
                .addFirefox()
                .addLibreOffice()
                .addVsCode()
                .build();
    }
}
