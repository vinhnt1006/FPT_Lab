package Combination.backtrack_uses;

import Combination.backtrack_core.BK_Problem;
import Combination.backtrack_core.Domain;
import Combination.backtrack_core.Proposal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductConsultanProblem extends BK_Problem {

    double maxBugdet;

    public ProductConsultanProblem(double maxBugdet) {
        this.maxBugdet = maxBugdet;
    }

    private static double total(int i, Proposal prop) {
        double S = 0;
        for (int j = 0; j <= i; j++) {
            Product p = (Product) prop.get(j);
            S += p.price;
        }
        return S;
    }

    private static double total(Proposal prop) {
        int lastPos = prop.size() - 1;
        return total(lastPos, prop);
    }

    @Override
    protected boolean accepted() {
        return total(proposal) <= maxBugdet;
    }

    @Override
    protected boolean accepted(int i, Object val) {
        proposal.add(val);
        return total(i, proposal) <= maxBugdet;
    }

    private String toString(Proposal prop) {
        double sum = total(prop);
        return prop.toString() + "---total " + (int) sum + "\n";
    }

    static Comparator comparator = (o1, o2) -> {
        double d = total((Proposal) o1) - total((Proposal) o2);
        return d < 0 ? -11 : d > 0 ? 1 : 0;
    };

    public static void main(String[] args) {
        double maxBudget = 30000000;
        Domain tvDom = new Domain();
        tvDom.add(new Product("TV01", "Sony 42", 4800000));
        tvDom.add(new Product("TV02", "LG 42", 3800000));
        tvDom.add(new Product("TV03", "Samsung 48", 7500000));
        tvDom.add(new Product("TV04", "Sony 55", 14800000));
        tvDom.add(new Product("TV05", "LG 65", 16800000));
        tvDom.add(new Product("TV06", "Samsung 55", 11200000));

        Domain rfDom = new Domain();
        rfDom.add(new Product("RF01", "National 420", 11800000));
        rfDom.add(new Product("RF02", "General 380", 10800000));
        rfDom.add(new Product("RF03", "Panasonic 180", 3500000));
        rfDom.add(new Product("RF04", "Hitachi 380", 9800000));
        rfDom.add(new Product("RF05", "Beko 250", 6700000));

        Domain fanDom = new Domain();
        fanDom.add(new Product("F01", "National F11", 800000));
        fanDom.add(new Product("F02", "General F02", 750000));
        fanDom.add(new Product("F03", "Panasonic F80", 1050000));

        ProductConsultanProblem prob = new ProductConsultanProblem(maxBudget);
        int i;
        for (i = 0; i < 3; i++) {
            prob.addVar(tvDom);
        }
        for (i = 0; i < 2; i++) {
            prob.addVar(rfDom);
        }

        for (i = 0; i < 2; i++) {
            prob.addVar(fanDom);
        }

        ArrayList<Proposal> sols=prob.bkSolve();
        if(sols.isEmpty()) System.out.println("No Solution!");
        else{
            System.out.println(sols.size() + " solutions.");
            Collections.sort(sols,comparator);
            for (Proposal sol : sols) {
                System.out.println(prob.toString(sol));
            }
        }
    }
}
