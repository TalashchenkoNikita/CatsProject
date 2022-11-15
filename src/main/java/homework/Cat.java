package homework;

import java.util.Objects;

public class Cat extends Predator {
    private String breed;

    Cat(String breed, String color, double weight) {
        this.breed = breed;
        setColor(color);
        setWeight(weight);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String sleep() {
        return "Котик спить...";
    }

    @Override
    public String hunt() {
        return "Кіт пиймав миш";
    }

    public String makeNoise() {
        return "Тигидик!";
    }

    public String lickBalls() {
        return "Не дивись! Лизь";
    }

    public String catSchedule(Weekdays day) {
        String result;
        switch (day) {
            case MON, WED, FRI -> result = sleep();
            case TUE, THU, SAT -> result = hunt();
            case SUN -> result = makeNoise();
            default -> result = lickBalls();
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return Objects.equals(breed, cat.breed) && Objects.equals(getColor(), cat.getColor())
                && Objects.equals(getWeight(), cat.getWeight());
    }

    @Override
    public int hashCode() {
        return breed != null ? breed.hashCode() + getColor().hashCode() + (int) getWeight() : 0;
    }
}
