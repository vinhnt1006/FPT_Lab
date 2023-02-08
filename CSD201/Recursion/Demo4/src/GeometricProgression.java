
public class GeometricProgression {

    public static double gp(int n, double a, double d) {
        if (n == 1) {
            return a;
        }
        return gp(n - 1, a, d) * d;
    }

    public static void main(String[] args) {
        System.out.println(gp(6, 1.5, 2));
    }
}
