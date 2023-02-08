package Combination.generate_core;

import java.util.ArrayList;

public class Generator {

    ArrayList<G_Domain> domains;
    G_Proposal proposal = null;
    boolean initiated = false;

    public Generator(ArrayList<G_Domain> domains) {
        this.domains = domains;
    }

    private G_Proposal getFirstSuggestion() {
        proposal = new G_Proposal();
        for (G_Domain D : domains) {
            D.reset();
            proposal.add(D.nextElement());
        }
        initiated = true;
        return proposal.copy();
    }

    private boolean isLastProposal() {
        for (G_Domain domain : domains) {
            if (!domain.isEnded()) {
                return false;
            }
        }
        return true;
    }

    public G_Proposal getProposal() {
        if (!initiated) {
            return getFirstSuggestion();
        }
        if (isLastProposal()) {
            return null;
        }
        int lastDom = domains.size() - 1;
        while (lastDom >= 0 && domains.get(lastDom).isEnded()) {
            domains.get(lastDom).reset();
            proposal.set(lastDom, domains.get(lastDom).nextElement());
            lastDom--;
        }
        Object newVal = domains.get(lastDom).nextElement();
        proposal.set(lastDom, newVal);
        return proposal.copy();
    }
}
