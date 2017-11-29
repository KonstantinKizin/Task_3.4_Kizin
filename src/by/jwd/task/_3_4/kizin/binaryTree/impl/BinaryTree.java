package by.jwd.task._3_4.kizin.binaryTree.impl;

import by.jwd.task._3_4.kizin.binaryTree.Tree;

public class BinaryTree<E> implements Tree<E> {

    private Node<E> root;

    @Override
    public void insertElement(Object key) {
       root = addNode(this.root, key);
    }

    @Override
    public <E> E getElement(E e1) {
        if(findNode(root,e1) == null){
            return null;
        }else {
            return (E)findNode(root,e1).value;
        }
    }

    @Override
    public boolean removeElement(E e) {
        return false;
    }

    @Override
    public <E1> E1[] getAll() {
        return null;
    }


    private Node addNode(Node<E> node, Object key) {
        if(!(key instanceof Comparable)){
            throw new UnsupportedOperationException("The value can't be inserted cause it doesn't implements comparable interface");
        }
        if(node == null){
            node = new Node<>();
            node.value = (E)key;
        }else if(((Comparable)node.value).compareTo(key) > 0) {
            node.leftChild = addNode(node.leftChild ,key);
        }else if(((Comparable)node.value).compareTo(key) <= 0){
            node.rightChild = addNode(node.rightChild , key);
        }
        return node;

    }

    private Node findNode(Node node , Object key){

        if(node == null){
            return null;
        }
        if(node.value.equals(key)){
            return node;
        }else if(((Comparable)node.value).compareTo(key) > 0){
            return findNode(node.leftChild , key);
        }else if(((Comparable)node.value).compareTo(key) < 0){
            return findNode(node.rightChild,key);
        }
        return node;
    }




}

