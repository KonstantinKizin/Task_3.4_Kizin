package by.jwd.task._3_4.kizin.main;
import by.jwd.task._3_4.kizin.binaryTree.Tree;
import by.jwd.task._3_4.kizin.list.MyList;
import by.jwd.task._3_4.kizin.list.impl.MyLinkedList;

import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

       MyList<String> myList = new MyLinkedList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println( myList.remove("B"));

        System.out.println(myList.get(0));

        System.out.println(myList);

        new String();

        Tree<String> tree = new Tree<String>();

        tree.addNode("A");
        tree.addNode("B");

        System.out.println(tree.root.getLeftChild());


    }
}
