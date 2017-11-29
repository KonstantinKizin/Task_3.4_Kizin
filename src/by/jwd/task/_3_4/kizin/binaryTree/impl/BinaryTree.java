package by.jwd.task._3_4.kizin.binaryTree.impl;

import by.jwd.task._3_4.kizin.binaryTree.Tree;
import by.jwd.task._3_4.kizin.list.MyList;
import by.jwd.task._3_4.kizin.list.impl.MyArrayList;


public class BinaryTree<E> implements Tree<E> {

    private Node<E> root;

    private int size = 0;

    private final MyList<E>  myArrayList = new MyArrayList<E>();

    @Override
    public void insertElement(Object key) {
       root = addNode(this.root, key);
       size++;
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
    public void removeElement(E e) {
        remove(e,root);
        size--;
    }

    @Override
    public <E>  MyList<E> getAll() {
        inOrder(root);
        return (MyList<E>) myArrayList;
    }

    @Override
    public int size() {
        return size;
    }


    private Node addNode(Node<E> node, Object key) {
        if(!(key instanceof Comparable)){
            throw new UnsupportedOperationException("The value can't be insert cause it doesn't implements comparable interface");
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


    private Node  findMin(Node node){
        Node min = node;

        if(min != null){
            while (min.leftChild != null){
                min = min.leftChild;
            }
        }
        return min;
    }

    private Node remove(Object key , Node node){

        if(node == null){
            return null;
        }

        if(((Comparable)node.value).compareTo(key) > 0){
            node.leftChild = remove(key,node.leftChild);
        }else if(((Comparable)node.value).compareTo(key) < 0){
            node.rightChild = remove(key,node.rightChild);
        }else {
            if(node.leftChild != null && node.rightChild != null){

                Node minNodeFromRight  = findMin(node.rightChild);
                node.value  = minNodeFromRight.value;
                remove(minNodeFromRight.value , node.rightChild);

            }else if(node.leftChild != null){
                node = node.leftChild;
            }else if(node.rightChild != null){
                node = node.rightChild;
            }else {
                node = null;
            }
        }
        return node;
    }


    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.leftChild);
        myArrayList.add((E)node.value);
        inOrder(node.rightChild);

    }







}

