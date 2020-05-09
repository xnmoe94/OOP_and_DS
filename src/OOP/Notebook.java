package OOP;

public class Notebook extends Computer {
            private static final String DAFAULT_NB_MAN = "Techo";
            private double screenSize;
            private double weight;


    public Notebook(String manufacturer, String processor, double ramSize, int diskSize, double processorSpeed,
                    double screenSize, double weight) {

        super(manufacturer, processor, ramSize, diskSize, processorSpeed);
        this.screenSize = screenSize;
        this.weight = weight;



    }

    public Notebook( String processor, double ramSize, int diskSize, double processorSpeed,
                    double screenSize, double weight) {


        this(DAFAULT_NB_MAN, processor, ramSize,diskSize,processorSpeed,screenSize,weight);
    }




        @Override
    public String toString() {

        String result = super.toString() +
                "\nscreenSize=" + screenSize +
                ", weight=" + weight;

        return result;
    }
}
