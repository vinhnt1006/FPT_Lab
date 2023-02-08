package Combination.generate_core_uses;

import Combination.generate_core.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class G_ProductConsultanProblem extends G_Problem {

    double maxBugdet;

    public G_ProductConsultanProblem(double maxBugdet) {
        this.maxBugdet = maxBugdet;
    }

    private static double total(G_Proposal prop) {
        double S = 0;
        for (Object object : prop) {
            S += ((G_Product) object).price;
        }
        return S;
    }

    @Override
    protected boolean accepted(G_Proposal p) {
        return total(p) <= maxBugdet;
    }

    private String toString(G_Proposal prop) {
        double sum = total(prop);
        return prop.toString() + "---total " + (int) sum + "\n";
    }

    static Comparator comparator = (o1, o2) -> {
        double d = total((G_Proposal) o1) - total((G_Proposal) o2);
        return d < 0 ? -11 : d > 0 ? 1 : 0;
    };

    public static void main(String[] args) {
        double maxBudget = 30000000;
        ArrayList<G_Product> tvList = new ArrayList();
        tvList.add(new G_Product("TV01", "Sony 42", 4800000));
        tvList.add(new G_Product("TV02", "LG 42", 3800000));
        tvList.add(new G_Product("TV03", "Samsung 48", 7500000));
        tvList.add(new G_Product("TV04", "Sony 55", 14800000));
        tvList.add(new G_Product("TV05", "LG 65", 16800000));
        tvList.add(new G_Product("TV06", "Samsung 55", 11200000));

        ArrayList<G_Product> rfList = new ArrayList();
        rfList.add(new G_Product("RF01", "National 420", 11800000));
        rfList.add(new G_Product("RF02", "General 380", 10800000));
        rfList.add(new G_Product("RF03", "Panasonic 180", 3500000));
        rfList.add(new G_Product("RF04", "Hitachi 380", 9800000));
        rfList.add(new G_Product("RF05", "Beko 250", 6700000));

        ArrayList<G_Product> fanList = new ArrayList();
        fanList.add(new G_Product("F01", "National F11", 800000));
        fanList.add(new G_Product("F02", "General F02", 750000));
        fanList.add(new G_Product("F03", "Panasonic F80", 1050000));

        G_ProductConsultanProblem prob = new G_ProductConsultanProblem(maxBudget);
        int i;
        for (i = 0; i < 3; i++) {
            prob.add(new G_Domain(tvList));
        }
        for (i = 0; i < 2; i++) {
            prob.add(new G_Domain(rfList));
        }

        for (i = 0; i < 2; i++) {
            prob.add(new G_Domain(fanList));
        }

        ArrayList<G_Proposal> sols = prob.solve();
        if (sols.isEmpty()) {
            System.out.println("No Solution!");
        } else {
            System.out.println(sols.size() + " solutions.");
            Collections.sort(sols, comparator);
            for (G_Proposal sol : sols) {
                System.out.println(prob.toString(sol));
            }
        }
    }
}
