package OOP;

public abstract class Food {

    private double calories;

    public double getCalories() {
        return calories;
    }

    public  abstract double percentprotein();
    public  abstract double percentFat();
    public  abstract double percentCarb();

    public Food(double calories) {
        this.calories = calories;
    }
}
