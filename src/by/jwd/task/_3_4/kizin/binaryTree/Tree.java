package by.jwd.task._3_4.kizin.binaryTree;

public class Tree<E> {
    public Node root;



    public void addNode(Object key){
        this.root = addNode(root,key);
    }


    private Node addNode(Node node , Object key){
        if(node == null){
            node = new Node();
            node.setValue(key);
        }

        if(!((E)key instanceof Comparable)){
            throw new UnsupportedOperationException();
        }else{
            if(((Comparable) node.getValue()).compareTo(key) >= 0) {
                node.setRightChild(addNode(node.getRightChild(), key));
            }else {
                node.setLeftChild(addNode(node.getLeftChild(), key));
            }
        }
        return node;
    }


}
