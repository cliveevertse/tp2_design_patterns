package tp.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class ReverseIterator implements Iterator {

    protected int current;

    protected SimpleList list;

    public boolean hasNext() {
        return (current > 0);
    }

    public void remove() {
        throw new UnsupportedOperationException("remove() not supported");
    }

    public Object next() {
        if (!hasNext()) {
            throw new ArrayIndexOutOfBoundsException("Iterator out of Bounds");
        } else {
            return list.get(--current);
        }
    }

    /**
     * Creates a new ReverseIterator from the given list.
     *
     * @param list the list to generate an iterator from
     */
    public ReverseIterator(SimpleList list) {
        super();
        this.list = list;
        current = list.count();
    }
}
