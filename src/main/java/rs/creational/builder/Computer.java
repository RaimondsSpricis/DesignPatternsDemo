package rs.creational.builder;

public class Computer {
    private final String hardwareModel;
    private final String os;
    private final boolean chrome;
    private final boolean edge;
    private final boolean firefox;
    private final boolean libreOffice;
    private final boolean vsCode;

    private Computer(Builder b) {
        this.hardwareModel = b.hardwareModel;
        this.os = b.os;
        this.chrome = b.chrome;
        this.edge = b.edge;
        this.firefox = b.firefox;
        this.libreOffice = b.libreOffice;
        this.vsCode = b.vsCode;
    }

    @Override
    public String toString() {
        return String.format("{ hardwareModel: '%s', os: '%s', chrome: %b, " +
                "edge: %b, firefox: %b, libreOffice: %b, vsCode: %b }",
                hardwareModel, os, chrome, edge, firefox, libreOffice, vsCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String hardwareModel;
        private String os;
        private boolean chrome;
        private boolean edge;
        private boolean firefox;
        private boolean libreOffice;
        private boolean vsCode;

        private Builder() {}

        public Builder addHardwareModel(String hardwareModel) {
            this.hardwareModel = hardwareModel;
            return this;
        }

        public Builder addOs(String os) {
            this.os = os;
            return this;
        }

        public Builder addChrome() {
            this.chrome = true;
            return this;
        }

        public Builder addEdge() {
            this.edge = true;
            return this;
        }

        public Builder addFirefox() {
            this.firefox = true;
            return this;
        }

        public Builder addLibreOffice() {
            this.libreOffice = true;
            return this;
        }

        public Builder addVsCode() {
            this.vsCode = true;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
