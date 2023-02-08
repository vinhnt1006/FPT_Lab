package recursion;

public class TestFibo {

    public static int fibo(int n) {
        if (n < 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static boolean testFibo(int x) {
        if (x < 1) {
            return false;
        }
        int aFibo = 1;
        int n = 2;
        while (aFibo < x) {
            aFibo = fibo(n++);
        }
        return x == aFibo;
    }

    public static void main(String[] args) {
        System.out.println(testFibo(55));
        System.out.println(testFibo(144));
        System.out.println(testFibo(120));
    }
}
