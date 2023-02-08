package Combination.generate_core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class G_Domain<E> extends ArrayList<E> {

    private Iterator<E> it;
    private boolean ended = false;

    public G_Domain() {
        super();
        it = this.iterator();
    }

    public G_Domain(Collection c) {
        super(c);
        it = this.iterator();
    }

    public boolean isEnded() {
        return ended;
    }

    public void reset() {
        it = this.iterator();
        ended = false;
    }

    public E nextElement() {
        E result = null;
        if (it.hasNext()) {
            result = it.next();
        }
        if (!it.hasNext()) {
            ended = true;
        }
        return result;
    }
}
