package OOP;

public class Computer {

    private String Manufacturer;
    private String Processor;
    private double ramSize;
    private int diskSize;
    private double processorSpeed;


    public Computer(String manufacturer, String processor, double ramSize, int diskSize, double processorSpeed) {
        Manufacturer = manufacturer;
        Processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.processorSpeed = processorSpeed;

        //This. makes the data field processor visible in the constructor
    }

    public double computerPower(){
        return ramSize * processorSpeed;
    }

    public double getRamSize() {
        return ramSize;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }


    @Override
    public String toString() {

        String result =
                "Manufacturer='" + Manufacturer + '\'' +
                ", Processor='" + Processor + '\'' +
                ", ramSize=" + ramSize +
                ", diskSize=" + diskSize +
                ", processorSpeed=" + processorSpeed;

        return result;

    }
}
