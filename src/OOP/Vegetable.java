package OOP;

public  class Vegetable extends Food {
    @Override
    public double percentprotein() {
        return 0;
    }

    @Override
    public double percentFat() {
        return 0;
    }

    @Override
    public double percentCarb() {
        return 0;
    }

    public Vegetable(double calories) {
        super(calories);
    }
}
