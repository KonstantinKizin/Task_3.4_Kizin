package by.jwd.task._3_4.kizin.list.impl;

class Node<E> {
    //without access modifier cause we use the class only inside the package.
    private Node next;
    private Node back;
    private E value;
    private int index;

    public by.jwd.task._3_4.kizin.list.impl.Node getNext() {
        return next;
    }

    public void setNext(by.jwd.task._3_4.kizin.list.impl.Node next) {
        this.next = next;
    }

    public by.jwd.task._3_4.kizin.list.impl.Node getBack() {
        return back;
    }

    public void setBack(by.jwd.task._3_4.kizin.list.impl.Node back) {
        this.back = back;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
