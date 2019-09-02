package builder.computer;

public class ComputerBuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB", "2 GB")
                                        .setBluetoothEnabled(true)
                                        .setGraphicsCardEnabled(true)
                                        .build();
    }
}
