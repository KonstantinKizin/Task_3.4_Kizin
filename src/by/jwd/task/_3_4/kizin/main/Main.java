package by.jwd.task._3_4.kizin.main;
import by.jwd.task._3_4.kizin.binaryTree.Tree;
import by.jwd.task._3_4.kizin.binaryTree.impl.BinaryTree;
import by.jwd.task._3_4.kizin.list.MyList;
import by.jwd.task._3_4.kizin.list.impl.MyArrayList;

import java.util.Iterator;


public class Main {

    public static void main(String[] args) {


        MyList<String > myList = new MyArrayList<>();

        myList.add("One");
        myList.add("two");
        myList.add("three");

        Iterator<String> iterator = myList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



//        Tree<String > tree = new BinaryTree<String>();
//
//        tree.insertElement("B");
//
//        tree.insertElement("A");
//
//        tree.insertElement("C");
//
//        String search = new String("C");














    }
}
