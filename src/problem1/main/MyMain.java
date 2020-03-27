/*
 *  Created by IntelliJ IDEA.
 *  User: Tavishi123-singh
 */
package problem1.main;
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree mytree=new MyBinarySearchTree();
        mytree.insert(5);
        mytree.insert(3);
        mytree.insert(2);
        mytree.insert(4);
        mytree.insert(7);
        mytree.insert(6);
        mytree.insert(8);
        mytree.insert(9);
        mytree.insert(1);
        System.out.println("PreOrder Traversal : ");
        mytree.traversePreOrder();
        System.out.println("Left children Only : ");
        //traverseLeft() methods prints all left children as well as returns the no of nodes not having left a child
        System.out.println("No. of nodes not having Left Subchild: "+mytree.traverseLeft());
    }
}
