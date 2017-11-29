package by.jwd.task._3_4.kizin.binaryTree;

public interface Tree<E> {

    void insertElement(Object key);

    <E> E getElement(E e);

    void removeElement(E e);

   <E> E[] getAll();

   int size();

}
