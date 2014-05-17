package tp.designpatterns.behavioral.iterator;

public interface SimpleList {

    public int count();

    public boolean append(Object o);

    public boolean remove(Object o);

    public Object get(int index);
}
