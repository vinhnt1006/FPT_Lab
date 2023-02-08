public class MinValue {
    public static int minValue(int a[], int n) {
        if (n == 1) {
            return a[0];
        }
        int m = minValue(a, n - 1);
        return m < a[n - 1] ? m : a[n - 1];
    }

    public static void main(String[] args) {
        int a[] = {1, 5, 9, 7, 2, 19, 10};
        System.out.println(minValue(a, a.length));
    }
}
