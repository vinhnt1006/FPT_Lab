package Combination.generate_core_uses;

import Combination.generate_core.*;
import java.util.ArrayList;

public class G_SubArrayProblem extends G_Problem {

    int a[];
    int sum;

    public G_SubArrayProblem(int[] a, int sum) {
        this.a = a;
        this.sum = sum;
    }

    private int sumOf(G_Proposal p) {
        int s = 0;
        for (Object object : p) {
            s += (object != null) ? (Integer) object : 0;
        }
        return s;
    }

    @Override
    protected boolean accepted(G_Proposal p) {
        return sumOf(p) == sum;
    }

    static String toString(G_Proposal p) {
        String S = "{";
        for (Object object : p) {
            if (object != null) {
                S += (Integer) object + ",";
            }
        }
        return S.substring(0, S.length() - 1) + "}";
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 37;

        G_SubArrayProblem prob = new G_SubArrayProblem(a, sum);
        for (int i = 0; i < a.length; i++) {
            G_Domain D = new G_Domain();
            D.add(null);
            D.add(a[i]);
            prob.add(D);
        }
        ArrayList<G_Proposal> sols = prob.solve();
        int n = sols.size();
        System.out.println(n + " sum arrays having sum = " + sum);
        if (sols.isEmpty()) {
            System.out.println("No Solution!");
        } else {
            for (G_Proposal sol : sols) {
                System.out.println(toString(sol));
            }
        }
    }
}
