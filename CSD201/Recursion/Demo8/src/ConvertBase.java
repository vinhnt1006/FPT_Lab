
public class ConvertBase {

    public static String convertBase(int n, int base) {
        if (n == 0) {
            return "0";
        }
        return convertBase(n / base, base) + Character.forDigit(n % base, base);
    }

    public static void main(String[] args) {
        System.out.println("Binary: " + convertBase(266, 2));
        System.out.println("Decimal: " + convertBase(266, 10));
        System.out.println("Octal: " + convertBase(266, 8));
        System.out.println("Hexadecimal: " + convertBase(266, 16));
    }
}
