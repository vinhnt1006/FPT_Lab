package Combination.generate_core_uses;

public class G_Product {

    String code;
    String name;
    double price;

    public G_Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return code + ", " + name + ", " + (int) price + "\n";
    }
}
