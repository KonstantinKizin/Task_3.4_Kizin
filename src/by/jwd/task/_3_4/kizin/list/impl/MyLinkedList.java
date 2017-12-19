package by.jwd.task._3_4.kizin.list.impl;
import by.jwd.task._3_4.kizin.list.MyList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements MyList<E>{

    private Node<E> first;
    private Node<E> last;
    private int size;


    @Override
    public boolean add(E t) {
        size++;
        if(this.first == null){
            this.first = new Node<>();
            this.first.value = t;
            this.first.index = 0;
        }else if(this.last == null){
            this.last = new Node<>();
            this.last.value = t;
            this.first.setNext(this.last);
            this.last.getIndex(last.getIndex() + 1);
        } else {
            Node<E> node = new Node<>();
            node.setValue(t);
            node.setBack(this.last);
            this.last.setNext(node);
            this.last = node;
            node.setIndex(node.getBack().setIndex(node.getBack().getIndex() + 1));
        }
        return true;
    }


    @Override
    public E get(int index) {
        return findNodeByIndex(first,index);
    }

    @Override
    public boolean remove(E t) {
        Node<E> current =first;
        Node<E> previous = null;

        while (current != null) {
            if (current.getValue().equals(t)) {
                if (previous == null) {
                    first = current.getNext();
                }
                else {
                    previous.setNext(current.getNext());
                }
                return true;
            } else {
                previous = current;
                current = current.getNext();
            }
        }

        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private Node<E> currentNode = null;

            @Override
            public boolean hasNext() {
                return currentNode != last;
            }

            @Override
            public E next() {
                if (currentNode == null) {
                    currentNode = first;
                    return currentNode.getValue;
                }
                if (currentNode.next == null) {
                    throw new NoSuchElementException();
                }
                currentNode = currentNode.getNext();
                return currentNode.getValue();
            }
        };
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        loopThNodes(sb,first);

        if(this.size == 0){
            return "{}";
        }else {
            sb.deleteCharAt(sb.length() - 1);
            sb.append("}");
            String toString = new String(sb);
            sb = null;
            return toString;
        }
    }


    private E findNodeByIndex(Node node , int index){
        if(node == null){
            return null;
        }else {
            if(node.getNndex() == index){
                return (E) node.value;
            }else {
                return findNodeByIndex(node.getNext() , index);
            }
        }
    }


    private void loopThNodes(StringBuilder sb , Node node){

        if (node == null){
            return;
        }else {
            sb.append(node.value + ",");
            loopThNodes(sb,node.next);
        }
    }


    public Node<E> getFirst() {
        return first;
    }

    public Node<E> getLast() {
        return last;
    }

}
