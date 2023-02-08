package Combination.backtrack_uses;

import Combination.backtrack_core.BK_Problem;
import Combination.backtrack_core.Domain;
import Combination.backtrack_core.Proposal;
import java.util.ArrayList;

public class BitStringProblem extends BK_Problem {

    int nBits;

    public BitStringProblem(int nBits) {
        this.nBits = nBits;
        Domain<Integer> D = new Domain();
        D.add(0);
        D.add(1);
        for (int i = 0; i < nBits; i++) {
            this.addVar(D);
        }
    }

    @Override
    protected boolean accepted() {
        return true;
    }

    @Override
    protected boolean accepted(int i, Object val) {
        proposal.add(val);
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        BitStringProblem prob = new BitStringProblem(n);
        ArrayList<Proposal> sols = prob.bkSolve();

        if (sols.isEmpty()) {
            System.out.println("No Solution!");
        } else {
            for (Proposal sol : sols) {
                System.out.println(sol);
            }
            System.out.println(sols.size() + " solution.");
        }
    }
}
