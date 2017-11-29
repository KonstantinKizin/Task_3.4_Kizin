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
            this.first.next = this.last;
            this.last.index += 1;
        } else {
            Node<E> node = new Node<>();
            node.value = t;
            node.back = this.last;
            this.last.next = node;
            this.last = node;
            node.index = node.back.index + 1;
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
            if (current.value.equals(t)) {
                if (previous == null) {
                    first = current.next;
                }
                else {
                    previous.next = current.next;
                }
                return true;
            } else {
                previous = current;
                current = current.next;
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
                    return currentNode.value;
                }
                if (currentNode.next == null) {
                    throw new NoSuchElementException();
                }
                currentNode = currentNode.next;
                return currentNode.value;
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
            if(node.index == index){
                return (E) node.value;
            }else {
                return findNodeByIndex(node.next , index);
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
