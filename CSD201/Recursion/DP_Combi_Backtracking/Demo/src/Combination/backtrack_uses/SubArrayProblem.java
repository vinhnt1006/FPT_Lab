package Combination.backtrack_uses;

import Combination.backtrack_core.BK_Problem;
import Combination.backtrack_core.Domain;
import Combination.backtrack_core.Proposal;
import java.util.ArrayList;

public class SubArrayProblem extends BK_Problem {

    int a[];
    int sum;

    public SubArrayProblem(int[] a, int sum) {
        this.a = a;
        this.sum = sum;
        for (int i = 0; i < a.length; i++) {
            Domain<Integer> D = new Domain();
            D.add(null);
            D.add(a[i]);
            this.addVar(D);
        }
    }

    private int sumTo(int p, Proposal prop) {
        int S = 0;
        for (int j = 0; j <= p; j++) {
            if (prop.get(j) != null) {
                S += (Integer) prop.get(j);
            }
        }
        return S;
    }

    @Override
    protected boolean accepted() {
        return sumTo(a.length - 1, proposal) == sum;
    }

    @Override
    protected boolean accepted(int i, Object val) {
        proposal.add(val);
        return sumTo(i, proposal) <= sum;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 37;
        SubArrayProblem prob = new SubArrayProblem(a, sum);
        ArrayList<Proposal> sols = prob.bkSolve();
        int n = sols.size();
        System.out.println(n + " sun arrays having sum = " + sum);
        if (sols.isEmpty()) {
            System.out.println("No Solution!");
        } else {
            for (Proposal sol : sols) {
                System.out.println(sol);
            }
        }
    }
}
