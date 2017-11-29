package by.jwd.task._3_4.kizin.list;

import java.util.Iterator;

public interface MyList<E> {

    boolean add(E t);

    E get(int index);

    boolean remove(E t);

    int size();

    Iterator<E> iterator();


}
