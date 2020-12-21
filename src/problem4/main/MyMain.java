/*
 *  Created by IntelliJ IDEA.
 *  User: Tavishi123-singh
 */
package problem4.main;
import problem1.mybst.MyBinarySearchTree;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem4.myqueue.MyQueue;

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
        MyQueue queue = new MyQueue();
        queue.storePreOrderSuccessor(mytree);
        queue.display();
    }
}