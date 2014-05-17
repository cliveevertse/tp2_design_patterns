package tp.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class OpenList implements SimpleList {

    java.util.LinkedList list = new java.util.LinkedList();

    public int count() {
        return list.size();
    }

    public boolean append(Object o) {
        list.addLast(o);
        return true;
    }

    public boolean remove(Object o) {
        return list.remove(o);
    }

    public Object get(int index) {
        return list.get(index);
    }

    public Iterator createReverseIterator() {
        return new ReverseIterator(this);
    }
}
