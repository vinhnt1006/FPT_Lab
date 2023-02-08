
public class MaxValue {

    public static int maxValue(int a[], int n) {
        if (n == 1) {
            return a[0];
        }
        int m = maxValue(a, n - 1);
        return m > a[n - 1] ? m : a[n - 1];
    }

    public static void main(String[] args) {
        int a[] = {1, 5, 9, 7, 2, 19, 10};
        System.out.println(maxValue(a, a.length));
    }
}
