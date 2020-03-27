/*
 *  Created by IntelliJ IDEA.
 *  User: Tavishi123-singh
 */
package problem2.main;
import problem2.mybst.MyBinarySearchTree;
// executable class

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree mytree=new MyBinarySearchTree();
        mytree.insert(10);
        mytree.insert(2);
        mytree.insert(20);
        mytree.insert(30);
        mytree.insert(15);
        mytree.insert(3);
        mytree.insert(1);
        System.out.println("PreOrder Traversal : ");
        mytree.traversePreOrder();
        System.out.println("InOrder Traversal : ");
        mytree.traverseInOrder();
        System.out.println("PostOrder Traversal : ");
        mytree.traversePostOrder();
        System.out.println("Condition A : Root element is placed at opposite end," +"\n"+
                "i.e; In pre order, root is the first element where as in post order, root is the last element. is TRUE");
        System.out.println("Condition B :They have common mid point,\n"+
                "i.e; both the traversal will give same element at the mid position for odd no. of nodes. is TRUE");
    }
}