
public class EightQueen {

    public static int[][] result = new int[10][10];
    public static int[] column = new int[10];
    public static int[] row1 = new int[20];
    public static int[] row2 = new int[20];
    public static int count = 0;
    public static int a = 1;
    public static int b = 1;

    public static void eightQueen(int n) {
        if (count == 1) {
            return;
        }
        if (n == a) {
            n++;
        }
        if (n <= 8) {
            for (int i = 1; i <= 8; i++) {
                if (column[i] == 0 && row1[i + n] == 0 && row2[i - n + 8] == 0) {
                    result[n][i] = 1;
                    column[i] = 1;
                    row1[i + n] = 1;
                    row2[i - n + 8] = 1;
                    eightQueen(n + 1);
                    column[i] = 0;
                    row1[i + n] = 0;
                    row2[i - n + 8] = 0;
                    result[n][i] = 0;
                }
            }
        } else {
            count = 1;
            for (int i = 1; i <= 8; i++) {
                for (int j = 1; j <= 8; j++) {
                    if (result[i][j] == 1) {
                        System.out.print("Q");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                result[i][j] = 0;
            }
        }
        for (int i = 0; i <= 9; i++) {
            column[i] = 0;
        }
        for (int i = 0; i <= 19; i++) {
            row1[i] = 0;
            row2[i] = 0;
        }
        result[a][b] = 1;
        column[b] = 1;
        row1[a + b] = 1;
        row2[b - a + 8] = 1;
        eightQueen(1);
    }
}
