package homework;

public abstract class Predator {
    private String color;
    private double weight;

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String sleep();

    public abstract String hunt();
}

