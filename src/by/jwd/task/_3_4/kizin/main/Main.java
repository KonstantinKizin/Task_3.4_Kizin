package by.jwd.task._3_4.kizin.main;
import by.jwd.task._3_4.kizin.binaryTree.Tree;
import by.jwd.task._3_4.kizin.binaryTree.impl.BinaryTree;



public class Main {

    public static void main(String[] args) {



        Tree<String > tree = new BinaryTree<>();

        tree.insertElement("A");

        tree.insertElement("B");

        tree.insertElement("C");



        System.out.println(tree.getElement("AS"));








    }
}
