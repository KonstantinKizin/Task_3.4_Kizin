package by.jwd.task._3_4.kizin.main;
import by.jwd.task._3_4.kizin.binaryTree.Tree;
import by.jwd.task._3_4.kizin.binaryTree.impl.BinaryTree;
import by.jwd.task._3_4.kizin.list.MyList;


public class Main {

    public static void main(String[] args) {



        Tree<String > tree = new BinaryTree<String>();

        tree.insertElement("B");

        tree.insertElement("A");

        tree.insertElement("C");

        String search = new String("C");


        MyList<String> myList = tree.getAll();

        for(int i = 0; i < myList.size() ; i++){

            System.out.println(myList.get(i));
        }

       










    }
}
