package by.jwd.task._3_4.kizin.main;
import by.jwd.task._3_4.kizin.binaryTree.Tree;
import by.jwd.task._3_4.kizin.binaryTree.impl.BinaryTree;



public class Main {

    public static void main(String[] args) {



        BinaryTree<String > tree = new BinaryTree<>();

        tree.insertElement("A");

        tree.insertElement("B");

        tree.insertElement("C");

        String search = new String("C");


       String[] ss = tree.getAll();

       for(String s : ss){
           System.out.println(s);
       }








    }
}
