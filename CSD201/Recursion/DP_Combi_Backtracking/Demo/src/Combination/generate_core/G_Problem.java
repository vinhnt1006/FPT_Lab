package Combination.generate_core;

import java.util.ArrayList;

public abstract class G_Problem extends ArrayList<G_Domain> {

    private int nWanted = -1;

    public G_Problem() {
        super();
    }

    protected abstract boolean accepted(G_Proposal p);

    public ArrayList<G_Proposal> solve(int nSolution) {
        int nWanted = nSolution;
        ArrayList<G_Proposal> solutions = new ArrayList();
        Generator G = new Generator(this);
        G_Proposal p = G.getProposal();
        while (p != null) {
            if (solutions.size() != nWanted) {
                if (accepted(p)) {
                    solutions.add(p);
                }
                p = G.getProposal();
            }
        }
        return solutions;
    }
    
    public ArrayList<G_Proposal> solve(){
        return solve(-1);
    } 
}
