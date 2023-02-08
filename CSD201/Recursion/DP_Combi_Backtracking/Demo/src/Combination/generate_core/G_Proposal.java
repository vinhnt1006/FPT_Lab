package Combination.generate_core;

import java.util.ArrayList;

public class G_Proposal extends ArrayList {

    public G_Proposal copy() {
        G_Proposal newP = new G_Proposal();
        for (int i = 0; i < this.size(); i++) {
            newP.add(this.get(i));
        }
        return newP;
    }
}
