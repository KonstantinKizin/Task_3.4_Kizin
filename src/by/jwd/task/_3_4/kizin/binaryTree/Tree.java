package by.jwd.task._3_4.kizin.binaryTree;

import by.jwd.task._3_4.kizin.list.MyList;

public interface Tree<E> {

    void insertElement(Object key);

    <E> E getElement(E e);

    void removeElement(E e);

   <E> MyList<E> getSortedElements();

   int size();

}
