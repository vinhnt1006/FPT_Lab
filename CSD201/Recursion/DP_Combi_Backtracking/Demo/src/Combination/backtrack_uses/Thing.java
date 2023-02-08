package Combination.backtrack_uses;

public class Thing {

    String name;
    int amount = 1;
    double weight = 0;
    double value = 0;

    public Thing(String name, double w, double v) {
        this.name = name;
        this.amount = 1;
        this.weight = w;
        this.value = v;
    }

    public Thing(String name, int amount, double w, double v) {
        this.name = name;
        this.amount = amount;
        this.weight = w;
        this.value = v;
    }

    @Override
    public String toString() {
        return "(" + name + "," + amount + "," + weight + "," + value + ")";
    }

}
