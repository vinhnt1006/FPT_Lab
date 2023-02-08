package Combination.backtrack_uses;

import Combination.backtrack_core.BK_Problem;
import Combination.backtrack_core.Domain;
import Combination.backtrack_core.Proposal;
import java.util.ArrayList;

public class ThingInBagProblem extends BK_Problem {

    ArrayList<Thing> list;
    double maxWeight;
    private int n;

    public ThingInBagProblem(ArrayList<Thing> list, double maxWeight) {
        this.list = list;
        this.maxWeight = maxWeight;
        this.n = list.size();
        for (int i = 0; i < list.size(); i++) {
            Domain D = new Domain();
            for (int j = 0; j <= list.get(i).amount; j++) {
                D.add(j);
            }
            this.addVar(D);
        }
    }

    private double totalWeight(int i) {
        double total = 0;
        for (int j = 0; j <= i; j++) {
            Thing t = (Thing) proposal.get(j);
            int amount = t.amount;
            double weight = t.weight;
            total += amount * weight;
        }
        return total;
    }

    @Override
    protected boolean accepted(int i, Object val) {
        String name = list.get(i).name;
        int amount = (Integer) val;
        double weight = list.get(i).weight;
        double value = list.get(i).value;
        Thing t = new Thing(name, amount, weight, value);
        proposal.add(t);
        return totalWeight(i) <= maxWeight;
    }

    @Override
    protected boolean accepted() {
        double W = totalWeight(n - 1);
        return W > 0 && W <= maxWeight;
    }

    public void addSolution() {
        Proposal newSol = new Proposal();
        for (Object x : this.proposal) {
            if (((Thing) x).amount > 0) {
                newSol.add(x);
            }
        }
        solutions.add(newSol);
    }

    public double totalvalue(Proposal sol) {
        double V = 0;
        for (Object x : sol) {
            V += ((Thing) x).amount * ((Thing) x).value;
        }
        return V;
    }

    public double bestValue() {
        double maxV = Double.MIN_VALUE;
        double V = 0;
        for (Proposal sol : solutions) {
            V = totalvalue(sol);
            if (maxV < V) {
                maxV = V;
            }
        }
        return maxV;
    }

    public ArrayList<Proposal> bestSolutions() {
        double maxV = bestValue();
        ArrayList<Proposal> bestSols = new ArrayList();
        for (Proposal sol : solutions) {
            if (totalvalue(sol) >= maxV) {
                bestSols.add(sol);
            }
        }
        return bestSols;
    }

    public static void main(String[] args) {
        ArrayList<Thing> list = new ArrayList();
        list.add(new Thing("T1", 5, 10, 5));
        list.add(new Thing("T2", 4, 5, 2));
        list.add(new Thing("T3", 3, 4, 1));
        list.add(new Thing("T4", 2, 15, 7));
        list.add(new Thing("T5", 1, 13.8, 4));
        list.add(new Thing("T6", 7, 10, 3));
        list.add(new Thing("T7", 3, 12, 6));
        list.add(new Thing("T8", 2, 9, 3));
        list.add(new Thing("T9", 4, 12, 2));
        list.add(new Thing("T10", 5, 18, 14));
        double maxWeight = 60;
        ThingInBagProblem prob = new ThingInBagProblem(list, maxWeight);
        ArrayList<Proposal> sols = prob.bkSolve();
        System.out.println("Bags having weight <= " + maxWeight);
        if (sols.isEmpty()) {
            System.out.println("No Solution!");
        } else {
            for (Proposal sol : sols) {
                System.out.println(sol);
            }
            System.out.println(sols.size() + " solutions.");
        }
        double maxV = prob.bestValue();
        System.out.println("The value in the best solution: " + maxV);
        ArrayList<Proposal> bestSols = prob.bestSolutions();
        System.out.println("Best solution:");
        for (Proposal sol : bestSols) {
            System.out.println(sol);
        }
    }
}
