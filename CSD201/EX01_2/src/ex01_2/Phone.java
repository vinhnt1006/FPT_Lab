/* Class for a phone */
package ex01_2;

public class Phone implements Comparable<Phone> {

    String code;      // ex: P01
    String manufacter; // Ex: Samsung
    String technique;  // ex: 3G
    int price;         // ex: 100

    @Override
    // Comparing 2 phones based on their codes. Ex: P01<P02
    public int compareTo(Phone o) {
        return this.code.compareTo(o.code);
    }

    // Constructor for searching a phone in a phone list based on it's code
    public Phone(String code) {
        this.code = code;
    }

    // Constructor for intitializing a specific phone
    public Phone(String code, String manu, String tech, int price) {
        this.code = code;
        this.manufacter = manu;
        this.technique = tech;
        this.price = price;
    }

    @Override
    // Convert the phone to string
    public String toString() {
        return code + ", " + manufacter + ", " + technique + ", " + price;
    }
}
